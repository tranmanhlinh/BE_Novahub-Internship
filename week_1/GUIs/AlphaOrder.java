import java.util.Scanner;

	public class AlphaOrder{  
	static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){   
     
     System.out.print("What's your last name? ");
     String lastName = keyboard.nextLine();
     lastName = lastName.toUpperCase();

     if(lastName.compareTo("Carswell".toUpperCase()) <= 0){
     	System.out.println("You don't have to wait long");     	
     } else if (lastName.compareTo("Jones".toUpperCase()) <= 0){
     	System.out.println("That's not bad"); 
     } 
     else if (lastName.compareTo("Smith".toUpperCase()) <= 0){
     	System.out.println("Looks like a bit of a wait"); 
     } else {
     	System.out.println("Not going anywhere for a while?");
     }


     } //end main method
        

}//end class


    // name is "Carswell" or before: say "you don't have to wait long"
    // name is "Jones" or before: say "that's not bad"
    // name is "Smith" or before: say "looks like a bit of a wait"
    // name is "Young" or before: say "it's gonna be a while"
    // name is after "Young": say "not going anywhere for a while?" 
// What's your last name? Stephanopolis
// It's going to be a while before we get to you, "Stephanopolis".