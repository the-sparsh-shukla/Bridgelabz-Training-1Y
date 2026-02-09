import java.util.Scanner;

public class UpperCaseCompare {

    static String manual(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') c -= 32;
            r += c;
        }
        return r;
    }

    static boolean same(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String m = manual(text);
        String b = text.toUpperCase();

        System.out.println("Same? " + same(m, b));
    }
}
