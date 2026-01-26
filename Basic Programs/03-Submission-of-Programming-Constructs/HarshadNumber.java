import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;        
        int originalNumber = number; 
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum = sum + digit;
            originalNumber = originalNumber / 10;
        }

        if (sum != 0 && number % sum == 0) {
            System.out.println(number + " is a Harshad Number");
        } else {
            System.out.println(number + " is not a Harshad Number");
        }
    }
}
