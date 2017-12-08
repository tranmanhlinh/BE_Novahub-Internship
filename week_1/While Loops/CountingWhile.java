import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}

	}
}

// What does n++ do? Remove it and see what happens. (Then put it back.)
	//Answer: increase n by 1 unit

// Change the code so that the loop repeats ten times instead of five.
	//Change the while(n<5)  to while (n<10)

// See if you can change the code so that the message still prints ten times, but the numbers in front count by tens, like so:
	// Change n++ to n+=10; System.out.println( (n+1) + ". " + message ); to System.out.println( (n+10) + ". " + message );