import java.util.Scanner;

public class ShortestLongestWord {

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] manualSplit(String text) {

        int len = findLength(text);
        int words = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        int[] spaces = new int[words - 1];
        int k = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaces[k++] = i;
            }
        }

        String[] result = new String[words];
        int start = 0;

        for (int i = 0; i < words; i++) {

            int end = (i < words - 1) ? spaces[i] : len;

            String temp = "";

            for (int j = start; j < end; j++) {
                temp += text.charAt(j);
            }

            result[i] = temp;
            start = end + 1;
        }

        return result;
    }

    public static String[][] wordsWithLengths(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            int len = findLength(words[i]);

            data[i][0] = words[i];
            data[i][1] = String.valueOf(len);
        }

        return data;
    }

    public static int[] findShortestLongest(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLengths(words);
        int[] indexes = findShortestLongest(table);

        System.out.println("Shortest word: " + table[indexes[0]][0]);
        System.out.println("Longest word: " + table[indexes[1]][0]);

        sc.close();
    }
}
