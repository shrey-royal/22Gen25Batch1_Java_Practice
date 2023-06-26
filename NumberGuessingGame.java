import java.util.Scanner;
import java.util.Random;    // Needed for the Random class

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // Create a Random object

        //Generate a random number between 1 and 100
        int secretNumber = rand.nextInt(100) + 1;

        //Initialize variables
        int attempts = 0;
        boolean guessed = false;    // Flag to indicate if the user has guessed the number

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        // Game Loop
        while(!guessed) {
            //Get user's Guess
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();

            //Increment the number of attempts
            attempts++;

            // Compare the guess with the secret number
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
                guessed = true;
            }
        }
        // Close the Scanner
        sc.close();
    }
}
