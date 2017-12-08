import java.util.Scanner;

public class AgeInFiveYears{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.println("Hello.  What is your name?");
     String name = keyboard.nextLine();

     System.out.println("Hi, "+name+"! How old are you? ");
     int age = keyboard.nextInt();
             
     
     System.out.println("Did you know that in five years you will be "+(age+5)+" years old?");
     System.out.println("And five years ago you were "+(age-5)+"! Imagine that!?");

 }

}

// Hello.  What is your name? Percy_Bysshe_Shelley

// Hi, Percy_Bysshe_Shelley!  How old are you? 34

// Did you know that in five years you will be 39 years old?
// And five years ago you were 29! Imagine that!