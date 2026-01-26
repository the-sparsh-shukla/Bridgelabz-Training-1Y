import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = input.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = input.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Good");
        } else if (average >= 40) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Pass");
        } else {
            System.out.println("Grade: F");
            System.out.println("Remarks: Fail");
        }
    }
}
