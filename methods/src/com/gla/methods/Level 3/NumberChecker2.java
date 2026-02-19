class NumberChecker2 {
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

    public static int sum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) s += arr[i];
        return s;
    }

    public static int sumSquares(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++)
            s += Math.pow(arr[i], 2);
        return s;
    }

    public static boolean isHarshad(int num, int[] arr) {
        return num % sum(arr) == 0;
    }

    public static int[][] frequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        for (int i = 0; i < arr.length; i++)
            freq[arr[i]][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);
        System.out.println(isHarshad(num, digits));
    }
}
