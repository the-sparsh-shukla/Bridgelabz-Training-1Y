import java.util.Scanner;

class Average_of_three_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First: ");
        double a = sc.nextDouble();
        System.out.print("Second: ");
        double b = sc.nextDouble();
        System.out.print("Third: ");
        double c = sc.nextDouble();
        System.out.println("Average = " + ((a + b + c) / 3));
        sc.close();
    }
}
