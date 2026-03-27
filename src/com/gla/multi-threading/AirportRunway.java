import java.util.concurrent.locks.ReentrantLock;

class Plane extends Thread {
    private static final ReentrantLock RUNWAY_LOCK = new ReentrantLock(true);

    public Plane(String name) {
        super(name);
    }

    @Override
    public void run() {
        RUNWAY_LOCK.lock();
        try {
            System.out.println(getName() + " got runway access");
            Thread.sleep(1800);
            System.out.println(getName() + " took off");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            RUNWAY_LOCK.unlock();
        }
    }
}

public class AirportRunway {
    public static void main(String[] args) {
        Thread p1 = new Plane("Flight-AI101");
        Thread p2 = new Plane("Flight-UK202");
        Thread p3 = new Plane("Flight-6E303");

        p1.start();
        p2.start();
        p3.start();
    }
}
