import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int numberOfStudents;
        Scanner input = new Scanner(System.in);

        numberOfStudents = input.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println(
            "The maximum number of handshakes among "
            + numberOfStudents + " students is " + handshakes
        );
    }
}
