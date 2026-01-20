import java.util.*;
public class Discount{
	public static void main( String [] args){
	
	double fee = 125000;
	double discount = 10;
	
	double discounts = (fee * discount)/100;
	double finalFee = fee - discount;
	
	System.out.println("the discount amount is INR " + discounts + "\n"
	+ " the final discounted fee is INR :" + finalFee);
	}
	}