class Signal extends Thread {
    private final String junction;
    private final int cycles;

    public Signal(String junction, int cycles) {
        this.junction = junction;
        this.cycles = cycles;
    }

    @Override
    public void run() {
        String[] colors = {"GREEN", "YELLOW", "RED"};
        try {
            for (int i = 0; i < cycles; i++) {
                for (String color : colors) {
                    System.out.println(junction + " -> " + color);
                    pause(800);
                }
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

public class TrafficControl {
    public static void main(String[] args) {
        Thread j1 = new Signal("Junction-1", 2);
        Thread j2 = new Signal("Junction-2", 2);

        j1.start();
        j2.start();
    }
}
