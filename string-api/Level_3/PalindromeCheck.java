import java.util.Scanner;

public class PalindromeCheck {

    static boolean checkPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    static char[] reverseString(String text) {
        char[] rev = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    static boolean checkPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        boolean result1 = checkPalindromeLoop(text);
        boolean result2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = checkPalindromeArray(text);

        System.out.println("Logic 1 Result: " + result1);
        System.out.println("Logic 2 Result: " + result2);
        System.out.println("Logic 3 Result: " + result3);

        sc.close();
    }
}
