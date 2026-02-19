class NumberChecker1 {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) { count++; num /= 10; }
        return count;
    }

    public static int[] getDigits(int num) {
        int count = countDigits(num);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        boolean hasZero = false;
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) hasZero = true;
        return hasZero;
    }

    public static boolean isArmstrong(int num, int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++)
            sum += Math.pow(digits[i], digits.length);
        return sum == num;
    }

    public static void largestTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) max2 = arr[i];
        }
        System.out.println("Largest: " + max1 + " Second: " + max2);
    }

    public static void smallestTwo(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) min2 = arr[i];
        }
        System.out.println("Smallest: " + min1 + " Second: " + min2);
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println(isDuck(digits));
        System.out.println(isArmstrong(num, digits));
        largestTwo(digits);
        smallestTwo(digits);
    }
}
