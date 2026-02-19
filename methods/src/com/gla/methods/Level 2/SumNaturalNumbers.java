import java.util.*;

public class SumNaturalNumbers {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int r1 = recursiveSum(n);
            int r2 = formulaSum(n);
            System.out.println(r1);
            System.out.println(r2);
            System.out.println(r1 == r2);
        }
        sc.close();
    }
}
