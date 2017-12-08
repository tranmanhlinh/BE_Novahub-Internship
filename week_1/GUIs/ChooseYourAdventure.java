import java.util.Scanner;

public class ChooseYourAdventure{

    static Scanner keyboard = new Scanner(System.in);
    
  public static void main(String[] arg){

     System.out.println("Welcome to my house, do you want to go to \"kitchen\" or go to \"upstair\"? ");
     String answer1 = keyboard.nextLine();

     if(answer1.equals("kitchen")){
        System.out.println("Would you like some \"cookies\" or \"cocacola\" ");
        String answer11 = keyboard.nextLine();
        if(answer11.equals("cookies")){
            System.out.println("You can find some cookies in the cabinet.");
        } else if(answer11.equals("cocacola")){
            System.out.println("You can find a bottle of cocacola in the freezer.");
        } else{
            System.out.println("Thing you want is not available.");
        }

     }else if(answer1.equals("upstair")){
             System.out.println("Welcome! But nothing you can do here. Please go back to the kitchen.");

     }else {
        System.out.println("You chose the wrong way.");
     }  
     
 }

}