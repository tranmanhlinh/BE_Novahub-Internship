import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "I will add up the numbers you give me." );
		int total = 0;
		System.out.println("Number: ");
		int number = keyboard.nextInt();

		while(number != 0){	
			total += number;	
			System.out.println("The total so far is "+total);	
			System.out.println("Number: ");
			number = keyboard.nextInt();									
			
		}

		System.out.println("The total is "+total);
		
	}
}



