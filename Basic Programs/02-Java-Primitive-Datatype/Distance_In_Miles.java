import java.util.Scanner;
public class DistanceInMiles{
	public static void main(String [] args ){
	Scanner input = new Scanner(System.in);
	double distanceFeet;
	distanceFeet = input.nextDouble();
		double yards = distanceFeet / 3;
		double miles = yards / 1760;
		System.out.println("the distance is yard is:" + yards +
		"and distance in miles is:" + miles);
		}
		}
	