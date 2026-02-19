import java.util.*;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;
        for (int i : numbers) {
            sum += i;
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
        
    }
    
}
