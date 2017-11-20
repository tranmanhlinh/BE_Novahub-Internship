import java.util.Random;
import java.util.Scanner;

public class NumberGuess{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int secretNumber = rd.nextInt(10)+1;
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();

		if(guess == secretNumber){
			System.out.println("That's right!  My secret number was "+secretNumber+"!");
		} else {
			System.out.println("Sorry, but I was really thinking of "+secretNumber+".");
		}
	}
}


// I'm thinking of a number from 1 to 10.
// Your guess: 3

// Sorry, but I was really thinking of 4.