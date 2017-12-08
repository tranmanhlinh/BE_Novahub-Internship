import java.util.Scanner;

public class NameAgeSalary{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.println("Hello.  What is your name?");
     String name = keyboard.nextLine();

     System.out.println("Hi, "+name+"! How old are you? ");
     int age = keyboard.nextInt();

     System.out.println("So you're "+age+", eh?  That's not old at all!");
     System.out.println("How much do you make, "+name+"?");
     double salary = keyboard.nextInt();          
     
     System.out.println(salary+"!  I hope that's per hour and not per year! LOL!");
 }

}

