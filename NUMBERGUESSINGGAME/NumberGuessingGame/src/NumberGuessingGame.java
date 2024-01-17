import java.util.Random;
import java.util.Scanner;

 public class NumberGuessingGame {
    private int secretRandomNumber;
    private int maximumAttempts;
    private int currentGuessNumberRound;

     public NumberGuessingGame(int maximumAttempts) { //parameterized constructor
         this.maximumAttempts = maximumAttempts;
         this.currentGuessNumberRound=1;
         generateSecretNumber();
     }

     public void generateSecretNumber(){
         Random random=new Random();
          secretRandomNumber=random.nextInt(4)+1;

     }



    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        while (currentGuessNumberRound <= maximumAttempts) {
            System.out.println("Round " + currentGuessNumberRound + "/" + maximumAttempts);
            System.out.print(" Enter your guess Number:  ");
            int playerNumberGuess = scanner.nextInt();

            if (playerNumberGuess < secretRandomNumber) {
                System.out.println(" ******* Your Guess Number Is Too low! Try again. *******");
            } else if (playerNumberGuess > secretRandomNumber) {
                System.out.println("****** Your Guess Number Is  Too high! Try again. ******");
            } else {
                System.out.println(" Congratulations! You guessed the correct number: " + secretRandomNumber);
                break;
            }

            currentGuessNumberRound++;
        }

        if (currentGuessNumberRound > maximumAttempts) {
            System.out.println(" ********  Sorry Player, your rounds attempt over. ********");
            System.out.println(" ----------- The correct number was :   --------------  " + secretRandomNumber);
        }

        scanner.close();
    }
}



