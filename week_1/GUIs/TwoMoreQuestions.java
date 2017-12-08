import java.util.Scanner;

public class TwoMoreQuestions{

  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] arg){

     System.out.println("TWO MORE QUESTIONS, BABY! ");
     System.out.println("Think of something and I'll try to guess it! ");
     while(true){
     System.out.println("Question 1) Does it stay inside or outside or both?");
     String type = keyboard.nextLine();
     System.out.println("Question 2) Is it a living thing? ");
     String compare = keyboard.nextLine();

     if(type.equals("inside") && compare.equals("yes")){
     	System.out.println("Then what else could you be thinking of besides a houseplant");
     } 
     if(type.equals("outside") && compare.equals("yes")){
     	System.out.println("Then what else could you be thinking of besides a bison");
     }
      if(type.equals("both") && compare.equals("yes")){
      	System.out.println("Then what else could you be thinking of besides a dog");
     }
     if(type.equals("inside") && compare.equals("no")){
     	System.out.println("Then what else could you be thinking of besides a shower curtain");
     } 
     if(type.equals("outside") && compare.equals("no")){
     	System.out.println("Then what else could you be thinking of besides a billboard");
     }
      if(type.equals("both") && compare.equals("no")){
      	System.out.println("Then what else could you be thinking of besides a cell phone");
     }
 	}   

	}
}



// TWO MORE QUESTIONS, BABY!

// Think of something and I'll try to guess it!

// Question 1) Does it stay inside or outside or both? outside
// Question 2) Is it a living thing? yes

// Then what else could you be thinking of besides a python?!?