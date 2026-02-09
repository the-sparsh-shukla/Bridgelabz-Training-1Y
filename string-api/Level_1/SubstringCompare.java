import java.util.Scanner;

public class SubstringCompare {

    static String manualSub(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++)
            r += s.charAt(i);
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        String m = manualSub(text, s, e);
        String b = text.substring(s, e);

        System.out.println("Same? " + compare(m, b));
    }
}
