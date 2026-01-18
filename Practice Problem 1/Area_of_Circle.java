import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            double area;

            area = 3.14 * radius * radius;

            System.out.println("Area of Circle = " + area);
        }
    }
}