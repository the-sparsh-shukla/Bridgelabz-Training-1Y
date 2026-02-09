import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int r = (int)(Math.random() * 3);

        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String comp) {

        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("rock") && comp.equals("paper")) return "Computer";

        if (user.equals("paper") && comp.equals("rock")) return "User";
        if (user.equals("paper") && comp.equals("scissors")) return "Computer";

        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("scissors") && comp.equals("rock")) return "Computer";

        return "Invalid";
    }

    public static String[][] calculateStats(String[] results) {

        int user = 0;
        int comp = 0;

        for (int i = 0; i < results.length; i++) {
            if (results[i].equals("User")) user++;
            if (results[i].equals("Computer")) comp++;
        }

        double total = results.length;
        double userPercent = (user * 100.0) / total;
        double compPercent = (comp * 100.0) / total;

        String[][] stats = new String[2][3];

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(user);
        stats[0][2] = String.format("%.2f", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(comp);
        stats[1][2] = String.format("%.2f", compPercent);

        return stats;
    }

    public static void display(String[][] games, String[][] stats) {

        System.out.println("Game\tUser\tComputer\tWinner");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[][] games = new String[n][3];
        String[] results = new String[n];

        for (int i = 0; i < n; i++) {

            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            String winner = findWinner(user, comp);

            games[i][0] = user;
            games[i][1] = comp;
            games[i][2] = winner;

            results[i] = winner;
        }

        String[][] stats = calculateStats(results);

        display(games, stats);

        sc.close();
    }
}
