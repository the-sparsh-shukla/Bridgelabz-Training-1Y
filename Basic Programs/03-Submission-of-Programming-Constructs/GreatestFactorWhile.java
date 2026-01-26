import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int greatestFactor = 1;      
        int counter = number - 1;    
        if (number <= 1) {
            System.out.println("No greatest factor exists.");
        } else {

            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;                   }
                counter--;
            }

            System.out.println(
                "Greatest factor of " + number + " (beside itself) is: " + greatestFactor
            );
        }
    }
}
