
import java.util.Scanner;

public class LittleQuiz{

    static Scanner keyboard = new Scanner(System.in);    

  public static void main(String[] arg){

  	int score = 0;
     System.out.print("Are you ready for a quiz? (y/n) ");
     String answer = keyboard.nextLine();
     if(!(answer.equals("n") || answer.equals("N"))){
     	System.out.println("Okay, here it comes!");

     	//Question 1
     	System.out.print("Q1) What is the capital of Alaska? \n"+
     		"1) Melbourne \n"+
     		"2) Anchorage \n"+
     		"3) Juneau\n");
     	int answer1 = keyboard.nextInt();
     	if(answer1==3){
     		System.out.println("That right!");
     		score++;
     	} else {
     		System.out.println("You are wrong! The answer is Juneau");
     	}

     	//Question 2
     	System.out.print("Q2) Can you store the value \"cat\" in a variable of type int? \n"+
     		"1) Yes \n"+
     		"2) No\n");
     	int answer2 = keyboard.nextInt();
     	if(answer2==2){
     		System.out.println("That right!");
     		score++;
     	} else {
     		System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
     	}

     	//Question 3
     	System.out.print("Q3) What is the result of 9+6/3? \n"+
     		"1) 5 \n"+
     		"2) 11 \n"+
     		"3) 15/3\n");
     	int answer3 = keyboard.nextInt();
     	if(answer3==2){
     		System.out.println("That correct!");
     		score++;
     	} else {
     		System.out.println("Sorry, the answer is 5");
     	}

     	System.out.println("Overall, you got "+score+" out of 3 correct.");
     	System.out.println("Thanks for playing");

     }
    

     
 }

}
// Are you ready for a quiz?  N
// Okay, here it comes!

// Q1) What is the capital of Alaska?
// 	1) Melbourne
// 	2) Anchorage
// 	3) Juneau

// > 3

// That's right!

// Q2) Can you store the value "cat" in a variable of type int?
// 	1) yes
// 	2) no

// > 1

// Sorry, "cat" is a string. ints can only store numbers.

// Q3) What is the result of 9+6/3?
// 	1) 5
// 	2) 11
// 	3) 15/3

// > 2

// That's correct!


// Overall, you got 2 out of 3 correct.
// Thanks for playing