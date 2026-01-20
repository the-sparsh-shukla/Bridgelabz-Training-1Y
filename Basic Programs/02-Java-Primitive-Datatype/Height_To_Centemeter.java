import java.util.Scanner;
public class HeightToCentemeter{
	public static void main(System [] args){
	Scanner input = new Scanner(System.in);
	double heightCm;
	heightCm = input.nextDouble();
	double totalInches = heightCm / 2.54;
	int feet = (int) (totalInches / 12);
	double inches = totalInches % 12;
	System.out.println("your height in cm is :" + heightCm +
	"while in feet is :" + feet + 
	"and inches is " + inches);
	}
	}