import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase();

        
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        if (s1.length() != s2.length()) {
            System.out.println("Strings are NOT anagrams.");
            return;
        }

        int[] freq = new int[256];  // ASCII characters

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram)
            System.out.println("Strings are ANAGRAMS.");
        else
            System.out.println("Strings are NOT anagrams.");

        sc.close();
    }
}
