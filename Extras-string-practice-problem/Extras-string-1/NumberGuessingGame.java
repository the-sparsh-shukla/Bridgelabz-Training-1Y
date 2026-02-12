import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static char getFeedback(Scanner sc) {
        System.out.print("Is it High(H), Low(L), or Correct(C)? ");
        return sc.next().toUpperCase().charAt(0);
    }

    static int updateLow(int guess) {
        return guess + 1;
    }

    static int updateHigh(int guess) {
        return guess - 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        char feedback;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Press Enter when ready...");
        sc.nextLine();

        do {
            int guess = generateGuess(low, high);
            attempts++;

            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback == 'H') {
                high = updateHigh(guess);
            } 
            else if (feedback == 'L') {
                low = updateLow(guess);
            }

        } while (feedback != 'C');

        System.out.println("Guessed correctly in " + attempts + " attempts!");
    }
}
