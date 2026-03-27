import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

// Ticket Class
class Ticket implements Comparable<Ticket> {
    int ticketId;
    String type;
    int priority;
    long createdTime;

    public Ticket(int id, String type, int priority) {
        this.ticketId = id;
        this.type = type;
        this.priority = priority;
        this.createdTime = System.currentTimeMillis();
    }

    @Override
    public int compareTo(Ticket other) {
        return other.priority - this.priority; // Higher priority first
    }
}

// Ticket Processor Thread
class TicketProcessor extends Thread {
    private final PriorityBlockingQueue<Ticket> queue;
    private static final Map<Integer, List<Long>> waitTimes = new HashMap<>();
    private static long totalProcessingTime = 0;

    public TicketProcessor(PriorityBlockingQueue<Ticket> queue, String name) {
        super(name);
        this.queue = queue;
    }

    @Override
    public void run() {
        Random rand = new Random();

        while (!queue.isEmpty()) {
            try {
                Ticket ticket = queue.poll();
                if (ticket == null) break;

                long startTime = System.currentTimeMillis();
                long waitTime = startTime - ticket.createdTime;

                synchronized (waitTimes) {
                    waitTimes.putIfAbsent(ticket.priority, new ArrayList<>());
                    waitTimes.get(ticket.priority).add(waitTime);
                }

                System.out.println("\n[START] Ticket #" + ticket.ticketId +
                        " | Type: " + ticket.type +
                        " | Priority: " + ticket.priority +
                        " | Agent: " + Thread.currentThread().getName());

                int sleepTime = rand.nextInt(5) + 1;
                pause(sleepTime * 1000L);

                long endTime = System.currentTimeMillis();

                synchronized (TicketProcessor.class) {
                    totalProcessingTime += (endTime - startTime);
                }

                System.out.println("[DONE] Ticket #" + ticket.ticketId +
                        " processed in " + sleepTime + " sec by " +
                        Thread.currentThread().getName());

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                Thread.currentThread().interrupt();
            }
        }
    }

    private static void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public static void printStats() {
        System.out.println("\n===== STATISTICS =====");
        for (Map.Entry<Integer, List<Long>> entry : waitTimes.entrySet()) {
            int priority = entry.getKey();
            List<Long> times = entry.getValue();

            long sum = 0;
            for (long t : times) sum += t;

            long avg = !times.isEmpty() ? sum / times.size() : 0;

            System.out.println("Priority " + priority +
                    " Avg Wait Time: " + avg + " ms");
        }

        System.out.println("Total Processing Time: " +
                totalProcessingTime + " ms");
    }
}

// Main Class
public class SupportSystem {
    public static void main(String[] args) throws InterruptedException {

        PriorityBlockingQueue<Ticket> queue = new PriorityBlockingQueue<>();

        // Ticket Types
        String[] types = {"Critical Bug", "Feature Request", "General Query", "Feedback"};
        int[] priorities = {10, 4, 2, 1};

        Random rand = new Random();

        // Create 10 tickets
        for (int i = 1; i <= 10; i++) {
            int index = rand.nextInt(types.length);
            Ticket t = new Ticket(i, types[index], priorities[index]);

            queue.add(t);

            System.out.println("Added Ticket #" + i +
                    " | Type: " + t.type +
                    " | Priority: " + t.priority +
                    " | Queue Position: " + queue.size());
        }

        // Create agents (threads)
        TicketProcessor t1 = new TicketProcessor(queue, "Agent-1");
        TicketProcessor t2 = new TicketProcessor(queue, "Agent-2");
        TicketProcessor t3 = new TicketProcessor(queue, "Agent-3");

        long startTime = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        long endTime = System.currentTimeMillis();

        System.out.println("\nAll tickets processed!");
        System.out.println("Total Execution Time: " + (endTime - startTime) + " ms");

        TicketProcessor.printStats();
    }
}
