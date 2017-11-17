import java.util.Scanner;

public class AgeMessages3{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("Your name: ");
     String name = keyboard.nextLine();

     System.out.print("Your age: ");
     int age = keyboard.nextInt();
             
     
     if(age < 16){
     	System.out.println("You can't drive, "+name);     	
     }
     if(age >= 16 && age < 18){
     	System.out.println("You can drive but not vote, "+name);     	
     } 
     if(age >= 18 && age < 25){
     	System.out.println("You can vote but not rent a car, "+name);     	
     } 
     if(age >= 25){
     	System.out.println("You can do pretty much any thing, "+name);     	
     }

 }

}