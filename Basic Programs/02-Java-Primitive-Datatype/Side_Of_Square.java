import java.util.Scanner;
public class SideOfSquare{
	public static void main (String [] args ){
	Scanner input = new Scanner (System.in);
	System.out.println("enter the perimeter ");
	double perimeter = input.nextDouble();
	double side = perimeter / 4 ;
	 System.out.println("the length of side is :" + side + 
	 " whoes perimeter is :"+  perimeter);
	 }
	 }