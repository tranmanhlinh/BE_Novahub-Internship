
import java.util.Scanner;

public class SafeSquareRoot{

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);		

		System.out.println("SQUARE ROOT!");
		System.out.print("Enter a number: ");
		int number = keyboard.nextInt();

		while(number < 0){
			System.out.println("You can't take the square root of a negative number, silly. \n"+
				"Try again: ");
			number = keyboard.nextInt();			
		} 

		System.out.println("The square root of "+number+" is "+Math.sqrt(number)+".");		
		
	}
}