import java.util.Scanner;
public class SumNaturalCompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        if (n >= 1) {   // check natural number
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;

            while (i <= n) {
                loopSum = loopSum + i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both results are correct and equal.");
            } else {
                System.out.println("Results are not equal.");
            }

        } else {
            System.out.println("The number is not a natural number.");
        }
    }
}
