import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of attempts per entered round:- ");
            int maximumAttemptsOfGame = scanner.nextInt();

            NumberGuessingGame game = new NumberGuessingGame(maximumAttemptsOfGame);
            game.playGame();

            scanner.close();
        }
}