import java.util.Scanner;

public class HowOldAreYou2{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.println("Hello.  What is your name? (Sorry, I keep forgeting) ");
     String name = keyboard.nextLine();

     System.out.println("Ok, "+name+"! How old are you? ");
     int age = keyboard.nextInt();
             
     
     if(age < 16){
     	System.out.println("You can't drive, "+name);     	
     } else if(age < 18){
     	System.out.println("You can drive but not vote, "+name);     	
     } else if(age < 25){
     	System.out.println("You can vote but not rent a car, "+name);     	
     } if(age >= 25){
     	System.out.println("You can do pretty much any thing, "+name);     	
     }

 }

}