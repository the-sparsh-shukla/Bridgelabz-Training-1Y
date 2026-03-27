import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class WarehouseWorker extends Thread {
    private final BlockingQueue<String> orderQueue;

    public WarehouseWorker(String name, BlockingQueue<String> orderQueue) {
        super(name);
        this.orderQueue = orderQueue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String orderId = orderQueue.poll();
                if (orderId == null) {
                    break;
                }
                System.out.println(getName() + " packing " + orderId);
                pause(1000);
                System.out.println(getName() + " dispatched " + orderId);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    private static void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

public class ECommerceWarehouse {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> orders = new LinkedBlockingQueue<>();
        for (int i = 1; i <= 8; i++) {
            orders.add("ORDER-" + i);
        }

        Thread w1 = new WarehouseWorker("Worker-1", orders);
        Thread w2 = new WarehouseWorker("Worker-2", orders);
        Thread w3 = new WarehouseWorker("Worker-3", orders);

        w1.start();
        w2.start();
        w3.start();

        w1.join();
        w2.join();
        w3.join();

        System.out.println("All orders dispatched");
    }
}
