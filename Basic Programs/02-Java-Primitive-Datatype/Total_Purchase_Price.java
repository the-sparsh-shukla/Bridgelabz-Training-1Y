import java.util.Scanner;
public class TotalPurchasePrice{
	public static void main(String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print ("enter the unitPrice");
	double unitPrice = input.nextDouble();
	System.out.print ("enter the quantity");
	double quantity = input.nextDouble();
	double totalPrice = unitPrice * quantity ;
	System.out.println("the total purchase price is INR : " + totalPrice 
	+ "\n" + "if the quantity :" + quantity + "\n"
	+ "and the unit price is INR:" +unitPrice);
	}
	}