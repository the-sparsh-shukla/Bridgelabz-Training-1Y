import java.util.Scanner;

public class SplitCompare {

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

    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (a[i].length() != b[i].length()) {
                return false;
            }

            for (int j = 0; j < a[i].length(); j++) {
                if (a[i].charAt(j) != b[i].charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtIn = text.split(" ");

        boolean result = compareArrays(manual, builtIn);

        System.out.println(result);

        sc.close();
    }
}

