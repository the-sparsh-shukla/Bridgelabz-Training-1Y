import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = input.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;   // 5% bonus
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Years of service is less than or equal to 5.");
        }
    }
}
