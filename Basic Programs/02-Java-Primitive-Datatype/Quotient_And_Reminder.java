import java.util.Scanner;
public class QuotientAndReminder{
	public static void main( String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enter the firstNo.");
	double firstNo = input.nextDouble();
	System.out.println("enter the secondNo.");
	double secondNo = input.nextDouble();
	double Quotient = firstNo / secondNo ;
	double reminder = firstNo % secondNo;
	System.out.println("the Quotient is :" + Quotient
	+ "\n" + "and reminder is :" + reminder + "\n" +
	"of two numbers :" + firstNo +  " and " + secondNo);
	}
	}