import java.util.*;

public class FriendsInfo {
    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int i : ages) if (i < min) min = i;
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int i : heights) if (i > max) max = i;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) ages[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) heights[i] = sc.nextInt();
        System.out.println(findYoungest(ages));
        System.out.println(findTallest(heights));
        sc.close();
    }
}
