import java.util.Scanner;

public class FactorialRecursive {

    static int takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    static long factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    static void displayResult(int n, long result) {
        System.out.println("Factorial of " + n + " = " + result);
    }

    public static void main(String[] args) {

        int num = takeInput();

        long fact = factorial(num);

        displayResult(num, fact);
    }
}
