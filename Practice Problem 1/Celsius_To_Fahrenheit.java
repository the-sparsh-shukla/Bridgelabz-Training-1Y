import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit;

            fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Fahrenheit = " + fahrenheit);
        }
    }
}