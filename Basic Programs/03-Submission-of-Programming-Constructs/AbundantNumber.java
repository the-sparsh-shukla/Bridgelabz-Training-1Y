import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner me = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = me.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
        me.close();
    }
}
