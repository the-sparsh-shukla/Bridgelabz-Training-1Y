class Device implements Runnable {
    private final String name;
    private final int interval;

    public Device(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " running at " + System.currentTimeMillis());
                pause(interval * 1000L);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }

    private static void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Device("Temperature Sensor", 5));
        Thread t2 = new Thread(new Device("Security Camera", 3));
        Thread t3 = new Thread(new Device("Light Controller", 4));
        Thread t4 = new Thread(new Device("Door Lock", 6));

        t1.setPriority(7);
        t2.setPriority(10);
        t3.setPriority(5);
        t4.setPriority(5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
