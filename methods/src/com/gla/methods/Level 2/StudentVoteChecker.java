import java.util.*;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) return false;
        if (age >= 18) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj = new StudentVoteChecker();
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println(obj.canStudentVote(ages[i]));
        }
        sc.close();
    }
}
