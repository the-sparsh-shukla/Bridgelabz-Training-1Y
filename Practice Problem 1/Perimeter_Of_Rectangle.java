import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter width: ");
            double width = sc.nextDouble();

            double perimeter = 2 * (length + width);

            System.out.println("Perimeter of Rectangle = " + perimeter);
        }
    }
}
