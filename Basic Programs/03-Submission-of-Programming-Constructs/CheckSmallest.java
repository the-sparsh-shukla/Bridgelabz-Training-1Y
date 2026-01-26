import java.util.Scanner;

public class CheckSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();

        System.out.println("Enter second number:");
        int number2 = input.nextInt();

        System.out.println("Enter third number:");
        int number3 = input.nextInt();

        if (number1 <= number2 && number1 <= number3) {
            System.out.println("The first number is smallest: " + number1);
        } 
        else if (number2 <= number1 && number2 <= number3) {
            System.out.println("The second number is smallest: " + number2);
        } 
        else {
            System.out.println("The third number is smallest: " + number3);
        }
    }
}
