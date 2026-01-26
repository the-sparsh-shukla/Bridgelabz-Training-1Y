import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } 
        else if (year % 400 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else if (year % 100 == 0) {
            System.out.println("Year is not a Leap Year");
        } 
        else if (year % 4 == 0) {
            System.out.println("Year is a Leap Year");
        } 
        else {
            System.out.println("Year is not a Leap Year");
        }
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("(Logical Check) Year is a Leap Year");
        } else if (year >= 1582) {
            System.out.println("(Logical Check) Year is not a Leap Year");
        }
    }
}
