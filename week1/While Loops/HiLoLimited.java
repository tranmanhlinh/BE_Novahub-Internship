import java.util.Random;
import java.util.Scanner;

public class HiLoLimited{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int times = 0;
		int secretNumber = rd.nextInt(100)+1;
		System.out.println("I'm thinking of a number from 1 to 100. You have 7 times to guess");
		int guess = -1;
		

		while (guess != secretNumber && times < 7){
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			if (guess < secretNumber){
			System.out.println("Sorry, you are too low.");
			} else if(guess > secretNumber) {
			System.out.println("Sorry, you are too high.");
			}
			times++;
		}

		if(times < 7){
			System.out.println("You guessed it!  What are the odds?!?");
		} else {
			System.out.println("Sorry, you didn't guess it in 7 tries.  You lose.");
		}
		
	}
}

// You guessed it!  What are the odds?!?
// Sorry, you didn't guess it in 7 tries.  You lose.
