import java.util.Scanner;
public class Quantity{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	double unitPrice = input.Double;
	double quantity = input.nextDouble();
	double totalPrice = unitPrice * quantity;
	System.out.println("the total purchase in INR" + totalPrice +
	"if the quantity" + quantity +
	"and unit price is INR" + unitPrice);
	}
	}