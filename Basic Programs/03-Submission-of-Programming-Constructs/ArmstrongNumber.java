import java.util.Scanner;
public class ArmstrongNumber{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter the number");
	int number = input.nextInt();
	int sum =0;
	int originalNumber = number;
	while(originalNumber !=0){
	int digit = originalNumber % 10;
	sum = sum + (digit * digit * digit);
	originalNumber = originalNumber /10;
	}
	if(sum == number){
	System.out.println(number + "is an armtrong no");
	}
	else {
	System.out.println(number+ "is not armstrong number");
	}
	}
	}