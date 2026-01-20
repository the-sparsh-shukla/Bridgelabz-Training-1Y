import java.util.Scanner;
public class ParemiterOfSquar{
	public static void main(String [] args){
	double perimeter ;
	Scanner input = new Scanner(System.in);
	perimeter = input.nextDouble();
	double side = perimeter / 4;
	System.out.println("the lengt of side is :" + side + 
	"whose perimeter is " + perimeter);
	}
	}