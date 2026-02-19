import java.util.Scanner;

class LineEquation {

    public static double distance(int x1,int y1,int x2,int y2) {
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] equation(int x1,int y1,int x2,int y2) {
        double m = (double)(y2-y1)/(x2-x1);
        double b = y1 - m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt(), y1=sc.nextInt();
        int x2=sc.nextInt(), y2=sc.nextInt();
        System.out.println(distance(x1,y1,x2,y2));
        double[] eq = equation(x1,y1,x2,y2);
        System.out.println("y = "+eq[0]+"x + "+eq[1]);

        sc.close();
    }
}
