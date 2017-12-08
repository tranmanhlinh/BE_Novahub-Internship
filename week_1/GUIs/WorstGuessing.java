import java.util.Scanner;

	public class WorstGuessing{  
	static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){   

  	int answer = 4;
     
     System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!! ");
     System.out.println("I\'M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
     int guess = keyboard.nextInt();

     if(guess!=answer){
     	System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS "+answer+"! ");
     } else {
     	System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS "+answer+"!");

     }

     } //end main method
        

}//end class

// TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!

// I"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! 3

// W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS 4!