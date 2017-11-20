import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int count = 0;
		int secretNumber = rd.nextInt(10)+1;
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();
		count++;

		while(guess != secretNumber){
			System.out.println("That is incorrect. Guess again! ");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			count++;
		}

		
		System.out.println("That's right! You are a good guesser.");
		System.out.println("It only took you "+count+" times to guess");
		
	}
}