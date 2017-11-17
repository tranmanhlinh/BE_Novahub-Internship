/*
The Forgetful Machine

Ask the user for two words and two numbers, and let the person at the keyboard type in some values, but don't bother storing their responses into any variables.

Again, there is no need to create any variables, except for the Scanner variable typically named keyboard.
*/
import java.util.Scanner;

public class TheForgetfulMachine{
	public static void main(String[] arg){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Give me a word! ");

		keyboard.nextLine();
		System.out.print("Give me a second word! ");
		keyboard.nextLine();
		
		System.out.print("Great, now your favorite number? ");
		keyboard.nextLine();
		
		System.out.print("And your second-favorite number... ");
		keyboard.nextLine();

		System.out.print("Whew!  Wasn't that fun? ");

	}
}
