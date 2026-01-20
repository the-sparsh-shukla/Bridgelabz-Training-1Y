import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the base");
	double base = input.nextDouble();
	System.out.println("enter the height");
	double height = input.nextDouble();
	double Area = 0.5 * base * height;
	double baseininches = base / 2.54;
	double heightininches = height / 2.54;
	double areaininches = 0.5 * baseininches * heightininches;
	
	System.out.println("the area of triangle in sq is :" +Area + "\n" + 
	"and in sq cm is :" + areaininches);
	}
	}