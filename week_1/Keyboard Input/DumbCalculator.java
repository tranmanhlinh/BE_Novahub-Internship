import java.util.Scanner;

public class DumbCalculator{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("What is your first number? ");
     double number1 = keyboard.nextDouble();
      System.out.print("What is your second number? ");
     double number2 = keyboard.nextDouble();
      System.out.print("What is your third number? ");
     double number3 = keyboard.nextDouble();

     System.out.println("( "+number1+" + "+number2+" + "+number3+" ) /2 is..."+(number1+number2+number3)/2);


     
 }

}

// What is your first number? 1.1
// What is your second number? 2.2
// What is your third number? 5.5

// ( 1.1 + 2.2 + 5.5 ) / 2 is... 4.4