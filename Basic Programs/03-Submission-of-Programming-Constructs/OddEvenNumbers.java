import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {

        Scanner raj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = raj.nextInt();

        if (number >= 1) {   // check natural number

            for (int i = 1; i <= number; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }

        } else {
            System.out.println("Please enter a natural number.");
        }
        raj.close();
    }
}
