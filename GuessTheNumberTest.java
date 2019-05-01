
import java.util.Scanner;

public class GuessTheNumberTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessTheNumber game = new GuessTheNumber();
        String answer;
        //loop to play and then ask to play again
        do {
            game.play();
            System.out.println();
            System.out.println("Do you want to play again? (yes/no): ");
            answer = input.nextLine();
        } while (answer.equals("yes"));

        //exit message
        System.out.println();
        System.out.println("Thanks for playing!");
    }
}
