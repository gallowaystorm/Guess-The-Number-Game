
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {

    private Scanner input = new Scanner(System.in);
    private SecureRandom randomNumbers = new SecureRandom();
    private int numberOfGuesses;

    public void play() {
        numberOfGuesses = 0;
        int magicNumber = 1 + randomNumbers.nextInt(10);

        //while loop to see if guess is low, high, or correct
        //and calling the askForGuess()
        int theGuess = askForGuess();

        while (theGuess != magicNumber) {
            if (theGuess > magicNumber) {
                System.out.println("Guess is too high");
                System.out.println("Please guess again");
            } else if (theGuess < magicNumber) {
                System.out.println("Guess is too low");
                System.out.println("Please guess again");
            }
            theGuess = askForGuess();

        }
        System.out.println("Guess is correct");
        System.out.printf("You guessed correctly in %d guesses!", numberOfGuesses);
    }

    private int askForGuess() {
        int guess = 0;

        //prompt for guess and check to see if between 1-10
        do {
            System.out.print("Please enter a number between 1 and 10: ");
            guess = input.nextInt();

            //extra spacing
            System.out.println();

            //check to see if guess 1-10
            while (guess < 1 || guess > 10) {
                System.out.println("Guess is out of range...");
                System.out.print("Please enter a number between 1 and 10: ");
                guess = input.nextInt();

                //extra spacing
                System.out.println();
            }
        } while (guess < 1 || guess > 10);

        numberOfGuesses = 1 + numberOfGuesses;

        return guess;
    }
}
