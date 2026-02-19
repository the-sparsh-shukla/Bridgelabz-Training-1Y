import java.util.Scanner;

public class QuotientAndRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            scanner.close();
            return;
        }

        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);

        scanner.close();
    }
}