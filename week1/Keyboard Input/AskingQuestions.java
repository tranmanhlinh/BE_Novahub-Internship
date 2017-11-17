

import java.util.Scanner;

class AskingQuestions{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("How old are you? ");
     int age = keyboard.nextInt();
     System.out.print("How many feet tall are you? ");
     int feet = keyboard.nextInt();
     System.out.print("How many inches tall are you? ");
     int inches = keyboard.nextInt();
     System.out.print("How much do you weigh? ");
     int weight = keyboard.nextInt();
      keyboard.nextLine();
     
     System.out.println("So, you're "+ age + " old, " + feet+"\'"+inches+"\" tall and " + weight + " heavy.");
 }

}

