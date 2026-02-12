import java.util.Scanner;

public class GCDLCM {

    static int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int gcd = findGCD(x, y);
        int lcm = findLCM(x, y);

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
