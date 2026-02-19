class FactorOperations {
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;
        return factors;
    }

    public static int greatest(int[] arr) {
        return arr[arr.length - 1];
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }

    public static int product(int[] arr) {
        int p = 1;
        for (int i = 0; i < arr.length; i++) p *= arr[i];
        return p;
    }

    public static double cubeProduct(int[] arr) {
        double p = 1;
        for (int i = 0; i < arr.length; i++)
            p *= Math.pow(arr[i], 3);
        return p;
    }

    public static void main(String[] args) {
        int[] factors = getFactors(12);
        System.out.println(greatest(factors));
        System.out.println(sum(factors));
        System.out.println(product(factors));
        System.out.println(cubeProduct(factors));
    }
}
