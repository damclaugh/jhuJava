package module_3;

import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args){

        // display message describing the rules of the game
        System.out.print("Guess the secret number!\nThe game is to pick a "
            + "positive number and then guess the secret number between 1 "
            + "and that number.\nYou'll also pick the total number of "
            + "guesses you're allowed to make.\n");
        char choice;
        
        // get user input for number range, number of allowed guess and 
        // guess of secret number
        // keep getting user input for guesses until 
        // repeat process as long as user doesn't quit
        do {
            Scanner input = new Scanner(System.in);

            // get the number that sets the range for the secret number 
            // (ie 1 - n)
            System.out.print("Enter the maximum number the secret number "
                    + "could be: ");
            int maxNumber = input.nextInt();

            // get maximum number of guesses allowed
            System.out.print("Enter the maximum number of guesses "
                + "allowed: ");
            int maxGuesses = input.nextInt();
            
            // get initial guess for secret number
            System.out.print("Enter guess for the secret number: ");
            int guessNumber = input.nextInt();
            
            // generate secretNumber and initiate counter
            int secretNumber = (int)(maxNumber * Math.random()) + 1;
            int guessCount = 1;

            // check if first guess is correct before entering while loop
            if (guessNumber == secretNumber){
                System.out.println("Correct!");
            }
            else{
                // keep checking guesses until the number of allowed guesses 
                // is reached
                while (guessCount < maxGuesses){
                    guessCount++;
                    if (guessNumber == secretNumber){
                        System.out.println("Correct!");
                        break;
                    }
                    else if(guessNumber > secretNumber){
                        System.out.print("Too high. Enter next guess: ");
                        guessNumber = input.nextInt();
                    } 
                    else{
                        System.out.print("Too low. Enter next guess: ");
                        guessNumber = input.nextInt();
                    }
                }
            }
            // ask user whether to play again
            // two different messages are possible depending on whether 
            // they guessed correctly
            if (guessNumber == secretNumber){
                System.out.print("Play again? Enter Q to quit or Y "
                    + "to play again. ");   
            }
            else{
                System.out.print("Incorrect. You're out of guesses. Play "
                    + "again? Enter Q to quit or Y to play again. ");
            }
            choice = input.next().charAt(0);
        } while (choice != 'Q');
    } // end main main
} // end SecretNumber class
