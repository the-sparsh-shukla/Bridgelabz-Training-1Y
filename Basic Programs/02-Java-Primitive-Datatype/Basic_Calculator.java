import java.util.Scanner;
public class BasicCalculator{
	public static void main(String [] args){
	double num1 , num2;
	Scanner input = new Scanner(System.in);
	num1 = input.nextDouble();
	num2 = input.nextDouble();
	
	double additation = num1 + num2;
	double subtraction = num1 + num2;
	double multiplication = num1 + num2;
	double division = num1 / num2;
	System.out.println("the additation , subtraction , multiplication , and division value of 2 no."
	+ num1 + "and" + num2+
	"is" + additation + "," + subtraction + "," + multiplication + ", and" + division
	);
	}
	}