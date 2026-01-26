import java.util.Scanner;
public class ChechLargestNumber{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("enter first num.");
	int num1 = input.nextInt();
	System.out.println("enter second num.");
	int num2 = input.nextInt();
	System.out.println("enter third num.");
	int num3 = input.nextInt();
	
	int FirstLargest = num1 >= num2 && num1 >= num3;
	int SecondLargest = num2 >= num1 && num2 >= num3;
	int ThirdLargest = num3 >= num1 && num3 >= num2;
	
	System.out.println("is the first number the largest" + FirstLargest);
	System.out.println("is the second number the largest" + SecondLargest);
	System.out.println("is the third number the largest" + ThirdLargest);
	}
	}
	