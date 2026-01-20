import java.util.Scanner;

class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate (%): ");
        double r = sc.nextDouble();
        System.out.print("Time (years): ");
        double t = sc.nextDouble();
        System.out.println("Simple Interest = " + ((p * r * t) / 100));
        sc.close();
    }
}
