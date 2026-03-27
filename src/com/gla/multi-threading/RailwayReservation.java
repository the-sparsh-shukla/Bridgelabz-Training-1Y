class ReservationCounter extends Thread {
    private static int availableSeats = 8;
    private static final Object LOCK = new Object();
    private final int requestedSeats;

    public ReservationCounter(String name, int requestedSeats) {
        super(name);
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            System.out.println(getName() + " requesting " + requestedSeats + " seats");
            if (availableSeats >= requestedSeats) {
                availableSeats -= requestedSeats;
                System.out.println(getName() + " booking confirmed. Remaining seats: " + availableSeats);
            } else {
                System.out.println(getName() + " booking failed. Remaining seats: " + availableSeats);
            }
        }
    }
}

public class RailwayReservation {
    public static void main(String[] args) {
        Thread t1 = new ReservationCounter("Counter-A", 3);
        Thread t2 = new ReservationCounter("Counter-B", 4);
        Thread t3 = new ReservationCounter("Counter-C", 2);

        t1.start();
        t2.start();
        t3.start();
    }
}
