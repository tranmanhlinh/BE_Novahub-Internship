import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int secretNumber = rd.nextInt(3)+1;
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n"+
						   "He glances at you out of the corner of his eye and starts shuffling.\n"+
							"He lays down three cards.\n"+
							"\nWhich one is the ace?");

		System.out.println();
		System.out.println("  ##  ##  ##");
		System.out.println("  ##  ##  ##");
		System.out.println("  1   2   3");
		System.out.println();
		int guess = keyboard.nextInt();

		if(guess != secretNumber){
			System.out.println("Ha! Fast Eddie wins again! The ace was card number "+secretNumber);
		} else {
			System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling");
		}

		switch(secretNumber){
			case 1: 
				System.out.println("  AA  ##  ##");
				System.out.println("  AA  ##  ##");
				System.out.println("  1   2   3");
				break;
			case 2:
				System.out.println("  ##  AA  ##");
				System.out.println("  ##  AA  ##");
				System.out.println("  1   2   3");
				break;
			case 3:
				System.out.println("  ##  ##  AA");
				System.out.println("  ##  ##  AA");
				System.out.println("  1   2   3");
				break;		

		}

		
	}
}

// You slide up to Fast Eddie's card table and plop down your cash.
// He glances at you out of the corner of his eye and starts shuffling.
// He lays down three cards.

// Which one is the ace?

// 	##  ##  ##
// 	##  ##  ##
// 	1   2   3

// > 2

// Ha! Fast Eddie wins again! The ace was card number 3.

// 	##  ##  AA
// 	##  ##  AA
// 	1   2   3