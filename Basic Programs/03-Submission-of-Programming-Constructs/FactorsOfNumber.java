import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner raj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = raj.nextInt();

        
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + " are:");

            
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
            raj.close();
        }
    }
}
