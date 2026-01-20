import java.util.Scanner;

class Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = sc.nextDouble();
        System.out.print("Height: ");
        double h = sc.nextDouble();
        System.out.println("Volume = " + (3.14 * r * r * h));
        sc.close();
    }
}