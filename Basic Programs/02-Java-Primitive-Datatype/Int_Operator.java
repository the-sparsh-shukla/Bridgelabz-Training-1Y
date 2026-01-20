import java.util.Scanner;
public class IntOperator{
	public static void main(String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enter the value a");
	int a = input.nextInt();
	System.out.println("enter the value b");
	int b = input.nextInt();
	System.out.println("enter the value c");
	int c = input.nextInt();
	
	int result1 = a + b * c;
	int result2 = a * b + c;
	int result3 = c + a / b;
	int result4 = a % b + c;
	
	System.out.println("the results of IntOperator are" +
	 result1 + " , " + result2 + " ,  " + result3 + 
	 " , "  + result4 );
	 }
	 }