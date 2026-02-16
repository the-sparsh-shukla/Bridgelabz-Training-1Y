import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;   
            System.out.println("Bonus amount is: " + bonus);
        } else {
            System.out.println("No bonus. Years of service is less than or equal to 5.");
        }
        sc.close();
    }
}
