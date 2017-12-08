import java.util.Scanner;

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS ";

		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;

		System.out.print("What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );

		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}

		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

		currentTemperature = savedTemperature; // restores original water temperature

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake...." );

		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

		} while ( currentTemperature >= minimumTemperature );

		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
	}
}

// Run the program, and type in 80.5 for the current water temperature. Do Goofus and Gallant swim for the same amount of time? Put your answer in a comment.
	//Answer: YES

// Run the program again, but this time enter 78 for the starting temperature. What changes?
	//Answer: Gallant: 0 min, Goofus: 1 min.

// Does Gallant check the water temperature first, or does he just dive right in?
	//Answer: Yes, he does.

// What about Goofus? Does he check the water temperature first or just dive in?
	// He just dive in

// What is the difference between a while loop and a "do-while" loop?
	//do while do at least one time before check the condition.

// One of these loops is sometimes called a "pre-test loop", and the other is called a "post-test loop". Which one is which?
	//While is pre-test loop and the other is post-test loop