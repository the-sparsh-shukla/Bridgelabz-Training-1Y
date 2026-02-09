import java.util.Scanner;

public class LowerCaseCompare {

    static String manual(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') c += 32;
            r += c;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String m = manual(text);
        String b = text.toLowerCase();

        System.out.println("Same? " + m.equals(b));
    }
}
