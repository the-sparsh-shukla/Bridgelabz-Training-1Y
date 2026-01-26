import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number >= 0) {   // check positive integer (including 0)

            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
