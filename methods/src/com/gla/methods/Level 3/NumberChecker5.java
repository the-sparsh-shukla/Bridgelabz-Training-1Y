class NumberChecker5 {
    public static int sumDivisors(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++)
            if (num % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int num) {
        return sumDivisors(num) == num;
    }

    public static boolean isAbundant(int num) {
        return sumDivisors(num) > num;
    }

    public static boolean isDeficient(int num) {
        return sumDivisors(num) < num;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(isPerfect(num));
        System.out.println(isAbundant(num));
        System.out.println(isDeficient(num));
        System.out.println(isStrong(num));
    }
}
