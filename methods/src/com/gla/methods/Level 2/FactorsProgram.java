import java.util.*;

public class FactorsProgram {
    public static int[] getFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    public static int getProduct(int[] arr) {
        int product = 1;
        for (int i : arr) product *= i;
        return product;
    }

    public static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int i : arr) sum += Math.pow(i, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] factors = getFactors(n);
        for (int i : factors) System.out.print(i + " ");
        System.out.println();
        System.out.println(getSum(factors));
        System.out.println(getProduct(factors));
        System.out.println(getSumOfSquares(factors));
    sc.close();
}
}
