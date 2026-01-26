import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {   // check positive integer

            int i = 1;
            while (i <= number) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }

                i++;   // increment
            }

        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}
