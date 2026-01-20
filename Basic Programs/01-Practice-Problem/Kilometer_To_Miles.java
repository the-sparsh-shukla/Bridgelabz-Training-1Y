import java.util.Scanner;

class Kilometer_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
        sc.close();
    }
}