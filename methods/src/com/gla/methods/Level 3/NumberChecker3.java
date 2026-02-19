class NumberChecker3 {
    public static int[] getDigits(int num) {
        int count = 0, temp = num;
        while (temp > 0) { count++; temp /= 10; }
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean compare(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        return compare(digits, reverse(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 1210;
        int[] digits = getDigits(num);
        System.out.println(isPalindrome(num));
        System.out.println(isDuck(digits));
    }
}
