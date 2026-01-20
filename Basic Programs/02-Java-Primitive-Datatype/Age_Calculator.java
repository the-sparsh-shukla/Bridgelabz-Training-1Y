import java.util.Scanner;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        double base, height;

        Scanner input = new Scanner(System.in);

        base = input.nextDouble();
        height = input.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;

        System.out.println(
            "The area of the triangle is " + areaInches +
            " square inches and " + areaCm + " square centimeters"
        );
    }
}
