import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner raj = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = raj.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        raj.close();
    }
}
