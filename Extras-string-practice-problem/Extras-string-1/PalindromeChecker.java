import java.util.Scanner;

public class PalindromeChecker {

    static String takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    static boolean isPalindrome(String s) {

        s = s.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    static void displayResult(String input, boolean result) {

        if (result)
            System.out.println("\"" + input + "\" is a Palindrome");
        else
            System.out.println("\"" + input + "\" is NOT a Palindrome");
    }

    public static void main(String[] args) {

        String text = takeInput();

        boolean check = isPalindrome(text);

        displayResult(text, check);
    }
}
