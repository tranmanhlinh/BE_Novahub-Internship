import java.util.Scanner;

public class AddingValuesForLoop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number = -1;
		int total = 0;
		while (number < 0) {
			System.out.print("number: ");
			number = keyboard.nextInt();
		}

		for (int i = 1;i <= number ;i++ ) {
			total += i;
			System.out.print(i+" ");
		}

		System.out.println("\nThe total is: "+total);

	}
}