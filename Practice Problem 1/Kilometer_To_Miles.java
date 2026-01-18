import java.util.Scanner;

class KilometerToMiles {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter distance in kilometers: ");
            double kilometers = sc.nextDouble();

            double miles = kilometers * 0.621371;

            System.out.println("Distance in miles = " + miles);
        }
    }
}
