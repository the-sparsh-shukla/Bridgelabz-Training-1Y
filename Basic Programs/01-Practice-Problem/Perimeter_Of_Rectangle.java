import java.util.Scanner;

class Perimeter_Of_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        double l = sc.nextDouble();
        System.out.print("Width: ");
        double w = sc.nextDouble();
        System.out.println("Perimeter = " + (2 * (l + w)));
        sc.close();
    }
}
