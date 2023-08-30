import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args)
     {

        Random random = new Random();

        int min = 1;
        int max = 100;

        int randomNumber = random.nextInt(max - min + 1) + min;

        int numberOfGuesses = 0;
        int maxGuesses = 5;
        boolean hasGuessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Guess Number Game");
        System.out.println("Guess A  Number to Win the Game");
		System.out.println("You have Maximum 5 attempt Limit");
       

        while (numberOfGuesses < maxGuesses)
        {
            System.out.print("Enter your guess numner between 1 to 100 :");
            int playerGuess = scanner.nextInt();
            numberOfGuesses++;

            if (playerGuess == randomNumber)
            {
                System.out.println("OOhoo! Your Number is Correct. You Win the Game!");
                hasGuessedCorrectly = true;
                break;
            } 
            else if (playerGuess < randomNumber)
            {
                System.out.println("Your Guess number is Smaller.");
            } 
            else 
            {
                System.out.println("Your Guess number is Greater.");
            }
            
            int remainingGuesses = maxGuesses - numberOfGuesses;
            if (remainingGuesses > 0) 
            {
                System.out.println("You have " + remainingGuesses + " guesses remaining.");
            } else 
            {
                System.out.println("Sorry, you've run out of guesses. The correct number was " + randomNumber + ".");
            }
        }

        scanner.close();
    }
}