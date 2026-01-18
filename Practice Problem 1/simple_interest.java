import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter principal: ");
            double principal = sc.nextDouble();
            System.out.print("Enter rate (percent): ");
            double rate = sc.nextDouble();
            System.out.print("Enter time (years): ");
            double time = sc.nextDouble();

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("Simple Interest = " + simpleInterest);
        }
    }
}
