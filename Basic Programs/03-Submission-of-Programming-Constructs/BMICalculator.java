import java.util.Scanner;
public class BMICalculator {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = input.nextDouble();

        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } 
		else if (bmi < 25) {
            System.out.println("Weight Status: Normal");
        }
		else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        }
		else {
            System.out.println("Weight Status: Obese");
        }
    }
}
