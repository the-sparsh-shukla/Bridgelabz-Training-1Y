import java.util.Scanner;

class Power_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double b = sc.nextDouble();
        System.out.print("Exponent: ");
        double e = sc.nextDouble();
        System.out.println("Result = " + Math.pow(b, e));
        sc.close();
    }
}
