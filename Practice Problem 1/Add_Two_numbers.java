import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int a = sc.nextInt();
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();

            int sum = a + b;

            System.out.println("Sum = " + sum);
        }
    }
}