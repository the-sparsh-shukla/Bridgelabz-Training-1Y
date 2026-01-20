import java.util.*;
public class VolumeOfEarth{
	public static void main(String [] args ){
	double radiusKm = 6378;
	double radiusMiles = radiusKm * 0621371;
	double pi = 3.14159;
	
	double volumeKm = (4/3) * pi * radiusKm * radiusKm *radiusKm;
	double volumeMiles = (4/3) * pi * radiusMiles * radiusMiles * radiusMiles;
	System.out.println("the volume of earth is " + volumeKm + "\n" +
	"and cubic miles is" + volumeMiles);
	}
	}