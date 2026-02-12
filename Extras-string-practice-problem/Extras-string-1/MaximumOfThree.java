import java.util.Scanner;

public class MaximumOfThree {

    static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];

        System.out.print("Enter first number: ");
        nums[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        nums[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        nums[2] = sc.nextInt();

        return nums;
    }

    static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        int[] numbers = takeInput();

        int max = findMaximum(numbers[0], numbers[1], numbers[2]);

        System.out.println("Maximum number is: " + max);
    }
}
