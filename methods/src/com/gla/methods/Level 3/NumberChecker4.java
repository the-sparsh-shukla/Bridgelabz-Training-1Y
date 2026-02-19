class NumberChecker4 {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int d = temp % 10;
            sum += d;
            product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(isPrime(num));
        System.out.println(isNeon(num));
        System.out.println(isSpy(num));
        System.out.println(isAutomorphic(num));
        System.out.println(isBuzz(num));
    }
}
