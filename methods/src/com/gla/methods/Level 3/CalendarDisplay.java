import java.util.Scanner;

class CalendarDisplay {

    public static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June",
                "July","August","September","October","November","December"};
        return months[month - 1];
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getDays(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeap(year)) return 29;
        return days[month - 1];
    }

    public static int firstDay(int month, int year) {
        int m = month, y = year;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (1 + (13*(m+1))/5 + k + k/4 + j/4 + 5*j) % 7;
        return (h + 6) % 7;
    }

    public static void display(int month, int year) {
        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(month, year);
        int days = getDays(month, year);
        for (int i = 0; i < start; i++)
            System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        display(month, year);

        sc.close();
    }
}
