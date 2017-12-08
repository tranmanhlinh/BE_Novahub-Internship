import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int secretNumber = rd.nextInt(100)+1;
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();

		if(guess == secretNumber){
			System.out.println("You guessed it!  What are the odds?!? "+secretNumber);
		} else if (guess < secretNumber){
			System.out.println("Sorry, you are too low.  I was thinking of "+secretNumber+".");
		} else {
			System.out.println("Sorry, you are too high.  I was thinking of "+secretNumber+".");
		}
	}
}

// I'm thinking of a number between 1-100.  Try to guess it.
// > 13

// Sorry, you are too low.  I was thinking of 34.
 

// I'm thinking of a number between 1-100.  Try to guess it.
// > 79

// Sorry, you are too high.  I was thinking of 51.
 

// I'm thinking of a number between 1-100.  Try to guess it.
// > 42

// You guessed it!  What are the odds?!?