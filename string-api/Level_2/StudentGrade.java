import java.util.Scanner;

public class StudentGrade {

    static String grade(double p) {
        if (p >= 90) return "A";
        if (p >= 75) return "B";
        if (p >= 60) return "C";
        if (p >= 40) return "D";
        return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            int t = p + c + m;
            double per = Math.round((t / 3.0) * 100.0) / 100.0;

            System.out.println(t + " " + per + " " + grade(per));
        }
    }
}
