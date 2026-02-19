public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20 && day <= 31) ||
               (month == 4 && day >= 1 && day <= 30) ||
               (month == 5 && day >= 1 && day <= 31) ||
               (month == 6 && day >= 1 && day <= 20);
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            if (isSpringSeason(month, day)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        } catch (NumberFormatException e) {
            System.out.println("Usage: java SpringSeason <month> <day>");
        }
    }
}