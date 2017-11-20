import java.util.Random;

public class Dice {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		int a = rd.nextInt(6)+1;
		int b = rd.nextInt(6)+1;
		System.out.println("Roll #1: "+a);
		System.out.println("Roll #1: "+b);
		System.out.println("The total is "+(a+b));

	}
}

// HERE COMES THE DICE!

// Roll #1: 3
// Roll #2: 5
// The total is 8!