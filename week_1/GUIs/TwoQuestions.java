import java.util.Scanner;

public class TwoQuestions{

    static Scanner keyboard = new Scanner(System.in);
    static void guess(String type, String compare){              
        switch(type){
            case "animal":
                switch(compare){
                    case "yes":
                     System.out.println("My guess is that you are thinking of a moose.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;
                    case "no":
                    System.out.println("My guess is that you are thinking of a squirrel.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;

                     default:
                     System.out.println("Wrong input! ");
                     break;         

                }
                break;

            case "vegetable":
                switch(compare){
                    case "yes":
                     System.out.println("My guess is that you are thinking of a watermelon.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;
                    case "no":
                    System.out.println("My guess is that you are thinking of a carrot.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;

                     default:
                     System.out.println("Wrong input! ");
                     break;               

                }
                break;

            case "mineral":
                switch(compare){
                    case "yes":
                     System.out.println("My guess is that you are thinking of a Camaro.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;
                    case "no":
                    System.out.println("My guess is that you are thinking of a paper clip.\n"+
                                        "I would ask you if I'm right, but I don't actually care.");
                     break;

                     default:
                     System.out.println("Wrong input! ");
                     break;               

                }
                break;

            default:
                System.out.println("I can't guess what are you thinking of? ");
                break;
        }
        
    }

  public static void main(String[] arg){

     System.out.println("TWO QUESTIONS! ");
     while(true){
     System.out.println("1) Is it animal, vegetable, or mineral? ");
     String type = keyboard.nextLine();
     System.out.println("Question 2) Is it bigger than a breadbox? ");
     String compare = keyboard.nextLine();

     guess(type, compare);
     }   
     
 }

}

// TWO QUESTIONS!
// Think of an object, and I'll try to guess it.

// Question 1) Is it animal, vegetable, or mineral?
// > animal

// Question 2) Is it bigger than a breadbox?
// > no
