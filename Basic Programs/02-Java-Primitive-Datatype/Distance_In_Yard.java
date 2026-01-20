import java.util.Scanner;
public class DistanceInYard{
	public static void main( String [] args){
	Scanner input = new Scanner (System.in);
	System.out.println("enetr the distance in feet");
	double distanceInFeet = input.nextDouble();
	double distanceInYard = distanceInFeet / 3;
	double distanceInMiles = distanceInFeet / 1760;
	System.out.println("the distance inn yard is:" + distanceInYard + "\n" +  
	" the distace in miles is :" + distanceInMiles);
	}
	}