import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int len1 = s1.length();
        int len2 = s2.length();
        int minLen = Math.min(len1, len2);

        boolean isDifferent = false;

        for (int i = 0; i < minLen; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                if (c1 < c2)
                    System.out.println("First string comes before second string.");
                else
                    System.out.println("Second string comes before first string.");

                isDifferent = true;
                break;
            }
        }

       
        if (!isDifferent) {
            if (len1 == len2)
                System.out.println("Both strings are equal.");
            else if (len1 < len2)
                System.out.println("First string comes before second string.");
            else
                System.out.println("Second string comes before first string.");
        }

        sc.close();
    }
}
