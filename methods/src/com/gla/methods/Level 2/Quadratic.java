import java.util.*;

public class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{r1, r2};
        } else if (delta == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        }
        return new double[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        for (double r : roots) System.out.println(r);
        sc.close();
    }
}
