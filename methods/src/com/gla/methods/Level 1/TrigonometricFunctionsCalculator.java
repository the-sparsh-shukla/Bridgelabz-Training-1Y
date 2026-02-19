import java.util.Scanner;

public class TrigonometricFunctionsCalculator {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + values[0]);
        System.out.println("Cosine: " + values[1]);
        System.out.println("Tangent: " + values[2]);

        scanner.close();
    }
}