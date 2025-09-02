package Assignment_5.lvl2;
import java.util.Scanner;

public class rockpaperscissor{

    // Method to get computer's choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if (user.equals("rock")) {
            return (computer.equals("scissors")) ? "User" : "Computer";
        } else if (user.equals("paper")) {
            return (computer.equals("rock")) ? "User" : "Computer";
        } else if (user.equals("scissors")) {
            return (computer.equals("paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }

    // Method to calculate stats
    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", userPercent) + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f", compPercent) + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
                               gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Player\tWins\tWin %");
        System.out.println("-------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock, paper, scissors): ");
            String userChoice = sc.nextLine().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, draws, totalGames);
        displayResults(gameResults, stats);

        sc.close();
    }
}

