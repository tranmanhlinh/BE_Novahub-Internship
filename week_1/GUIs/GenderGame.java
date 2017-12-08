import java.util.Scanner;

public class GenderGame{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("What is your gender (m or f): ");
     char gender = keyboard.next().charAt(0);
     keyboard.nextLine();
     System.out.print("First name: ");
     String firstName = keyboard.nextLine();
     System.out.print("Last name: ");
     String lastName = keyboard.nextLine();
     System.out.print("Age: ");
     int age = keyboard.nextInt();

     if(gender == 'f' && age >= 20){
        System.out.print("Are you married, "+firstName+" (y or n)? ");
         char married = keyboard.next().charAt(0);         
         System.out.print("Then I shall call you ");
         if(married == 'y'){
             System.out.print("Mrs. ");  
         } else if(married == 'n'){
            System.out.print("Ms. "); 
         }
         System.out.println(lastName);
     } else {
        System.out.print("Then I shall call you ");
        if(gender == 'm' && age >= 20){
            System.out.print("Mr. "+lastName);
        } else {
            System.out.print(firstName+" "+lastName+".");
        }
      }


     } //end main method
        

}//end class


// What is your gender (M or F): F
// First name: Kim
// Last name: Kardashian
// Age: 32 

// Are you married, Kim (y or n)? y

// Then I shall call you Mrs. Kardashian.