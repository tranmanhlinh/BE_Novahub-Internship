import java.util.Random;

public class Randomness
{
	public static void main ( String[] args )
	{
		Random r = new Random(12436);

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );

		System.out.println( "Here are some numbers from 1 to 5!" );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.print( 1 + r.nextInt(5) + " " );
		System.out.println();

		System.out.println( "Here are some numbers from 1 to 100!" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.print( 1 + r.nextInt(100) + "\t" );
		System.out.println();

		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);

		if ( num1 == num2 )
		{
			System.out.println( "The random numbers were the same! Weird." );
		}
		if ( num1 != num2 )
		{
			System.out.println( "The random numbers were different! Not too surprising, actually." );
		}
	}
}


    // 1)Delete the 1 + in front of all six lines that pick numbers 1-5, 
	// so that they look like this: System.out.print( r.nextInt(5) + " " ); 
	// Run the program a few times, and see if you can figure out what range the new random numbers are in.
		//Answer: range the number from 0 to 4

    // 2) Change the 1 + in front of all six lines that pick numbers 1-5, so that they look like this: 
    //System.out.print( 3 + r.nextInt(5) + " " ); Run the program a few times. 
    //Is it picking random numbers from 3 to 5? If not, what range are they?
        //Answer: range the number from 3 to 8

    // Change the line where you create the random number generator so that it looks like this: 
	//Random r = new Random(12353); This number is called a seed. Run the program a few times. 
	//What do you notice? What happened to the random numbers?
		//Answer: The random number are although I run the program many times.

    // Change to random seed to something else and observe the behavior. What happens to the random numbers?
    // (Delete the random seed before turning in the assignment.) 
	    //Answer: The random number changes but it still the same after that

