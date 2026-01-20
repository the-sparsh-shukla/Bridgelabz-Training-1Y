import java.util.Scanner;

class Add_Two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number: ");
        int a = sc.nextInt();
        System.out.print("Second number: ");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        sc.close();
    }
}