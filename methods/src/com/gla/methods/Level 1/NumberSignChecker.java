import java.util.Scanner;

public class NumberSignChecker {
    public static int checkNumberSign(int number) {
        if (number < 0) {
            return -1;
        } else if (number > 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = checkNumberSign(number);

        if (result == -1) {
            System.out.println("Negative number");
        } else if (result == 1) {
            System.out.println("Positive number");
        } else {
            System.out.println("Zero");
        }

        scanner.close();
    }
}