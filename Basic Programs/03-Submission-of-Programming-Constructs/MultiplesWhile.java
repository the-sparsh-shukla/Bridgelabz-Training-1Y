import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0 && number < 100) {

            int counter = 100;

            System.out.println("Multiples of " + number + " below 100 are:");

            while (counter > 0) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }

        } else {
            System.out.println("Please enter a positive number less than 100.");
        }
    }
}
