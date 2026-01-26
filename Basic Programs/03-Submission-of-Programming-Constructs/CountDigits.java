import java.util.Scanner;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;   // b. initialize count
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
           }
      }

        System.out.println("Number of digits = " + count);
    }
}
