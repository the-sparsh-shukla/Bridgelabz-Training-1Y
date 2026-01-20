import java.util.Scanner;
public class Disscount{
	public static void main(String [] args){
	double fee;
	double discountPer;
	Scanner input =new Scanner(System.in);
	fee = input.nextDouble();
	discountPer = input.nextDouble();
	double discount = (fee * discountPer)/100;
	double finalfee = fee - discount;
	System.out.println("the discount amount is INR" + discount +
	" and final discount fee is INR" + finalfee);
	}
	}