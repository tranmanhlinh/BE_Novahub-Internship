import java.util.Scanner;

public class EnterPin
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}

// How is a while loop similar to an if statement?
	//Answer: Check condition

// How is a while loop different from an if statement?
	//Answer: if the condition are true, if statement will execute one time while loops execute many times
			// until the condition are false.

// Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
	//Answer: because entry variable have declared before.

// Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
	//Answer: the program will print 2 line inside the loop forever if you type a wrong pin because the condition always true

// (Put the entry = keyboard.nextInt(); back before you turn in the assignment.)