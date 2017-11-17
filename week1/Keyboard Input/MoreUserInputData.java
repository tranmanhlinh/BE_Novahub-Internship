
import java.util.Scanner;

public class MoreUserInputData{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.println("Please enter the following information so I can sell it for a profit!");
     System.out.println();
     System.out.print("First name: ");
     String firstName = keyboard.nextLine();
     System.out.print("Last name: ");
     String lastName = keyboard.nextLine();
     System.out.print("Grade (9-12): ");
     int grade = keyboard.nextInt();
     System.out.print("Student ID: ");
     int id = keyboard.nextInt();
     keyboard.nextLine();
     System.out.print("Login: ");     
     String login = keyboard.nextLine();
     System.out.print("GPA (0.0-4.0): ");  
     double gpa = keyboard.nextDouble();

      System.out.println();
      System.out.println("Your information:");
      System.out.println("Login: " + login); 
      System.out.println("ID: " + id); 
      System.out.println("Name: " + firstName + " " + lastName); 
      System.out.println("GPA: " + gpa); 
      System.out.println("Grade: " + grade); 
     
 }

}


// Please enter the following information so I can sell it for a profit!

// First name: Helena
// Last name: Bonham-Carter
// Grade (9-12): 12
// Student ID: 453916
// Login: bonham_453916
// GPA (0.0-4.0): 3.73

// Your information:
// 	Login: bonham_453916 
// 	ID:    453916 
// 	Name:  Bonham-Carter, Helena 
// 	GPA:   3.73 
// 	Grade: 12 