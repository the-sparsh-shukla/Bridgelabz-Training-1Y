import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double value;

        System.out.print("Enter a value (0 to stop): ");
        value = input.nextDouble();

        while (value != 0) {
            total = total + value;

            System.out.print("Enter a value (0 to stop): ");
            value = input.nextDouble();
        }

        System.out.println("The total is: " + total);
    }
}
