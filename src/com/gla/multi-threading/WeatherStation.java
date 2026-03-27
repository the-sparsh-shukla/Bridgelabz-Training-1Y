import java.util.Random;

class WeatherSensor extends Thread {
    private final String sensorName;

    public WeatherSensor(String sensorName) {
        this.sensorName = sensorName;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                int temperature = random.nextInt(16) + 20;
                int humidity = random.nextInt(31) + 40;
                System.out.println(sensorName + " -> Temp: " + temperature + "C, Humidity: " + humidity + "%");
                pause(1200);
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

public class WeatherStation {
    public static void main(String[] args) {
        Thread s1 = new WeatherSensor("North-Sensor");
        Thread s2 = new WeatherSensor("South-Sensor");

        s1.start();
        s2.start();
    }
}
