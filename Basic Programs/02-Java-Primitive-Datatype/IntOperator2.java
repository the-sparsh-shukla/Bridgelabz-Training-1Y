import java.util.Scanner;
public class IntOperator2{
	public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enter the value a");
	double a = input.nextDouble();
	System.out.println("enter the value b");
	double b = input.nextDouble();
	System.out.println("enter the value c");
	double c = input.nextDouble();
	
	double result1 = a + b * c;
	double result2 = a * b + c;
	double result3 = c + a / b;
	double result4 = a % b + c;
	
	System.out.println("the results of IntOperator are" +
	 result1 + " , " + result2 + " ,  " + result3 + 
	 " , "  + result4 );
	 }
	 }