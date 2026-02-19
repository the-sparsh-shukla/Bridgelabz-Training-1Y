import java.util.Scanner;

public class TriangularParkRounds {
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double side3 = scanner.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("Number of rounds needed to complete 5 km: " + rounds);

        scanner.close();
    }
}