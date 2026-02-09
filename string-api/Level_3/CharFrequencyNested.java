import java.util.Scanner;

public class CharFrequencyNested {

    public static String[] frequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0') continue;

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') count++;
        }

        String[] result = new String[count * 2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = String.valueOf(chars[i]);
                result[index++] = String.valueOf(freq[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] output = frequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < output.length; i += 2) {
            System.out.println(output[i] + "\t\t" + output[i + 1]);
        }

        sc.close();
    }
}
