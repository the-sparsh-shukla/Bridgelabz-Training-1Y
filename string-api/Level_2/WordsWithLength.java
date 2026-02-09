import java.util.Scanner;

public class WordsWithLength {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = wordsWithLengths(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
}
