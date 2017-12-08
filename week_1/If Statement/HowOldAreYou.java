import java.util.Scanner;

public class HowOldAreYou{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.println("Hello.  What is your name?");
     String name = keyboard.nextLine();

     System.out.println("Hi, "+name+"! How old are you? ");
     int age = keyboard.nextInt();
             
     
     if(age < 16){
     	System.out.println("You can't drive, "+name);     	
     }

     if(age < 18){
     	System.out.println("You can't vote, "+name);     	
     }

     if(age < 25){
     	System.out.println("You can't rent a car, "+name);     	
     }

     if(age >= 25){
     	System.out.println("You can do anything that's legal, "+name);     	
     }

 }

}