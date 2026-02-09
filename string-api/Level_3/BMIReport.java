import java.util.Scanner;

public class BMIReport {

    static String status(double b) {
        if (b < 18.5) return "Underweight";
        if (b < 25) return "Normal";
        if (b < 30) return "Overweight";
        return "Obese";
    }

    static String[][] compute(double[][] hw) {
        String[][] r = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {
            double w = hw[i][0];
            double h = hw[i][1] / 100.0;
            double bmi = w / (h * h);

            r[i][0] = String.valueOf(hw[i][1]);
            r[i][1] = String.valueOf(w);
            r[i][2] = String.format("%.2f", bmi);
            r[i][3] = status(bmi);
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[10][2];

        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble();
            hw[i][1] = sc.nextDouble();
        }

        String[][] r = compute(hw);

        for (String[] x : r)
            System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3]);
    }
}
