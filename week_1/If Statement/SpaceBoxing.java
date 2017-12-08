import java.util.Scanner;

public class SpaceBoxing{

    static Scanner keyboard = new Scanner(System.in);
    static double calWeight(int planet, double weight){   
        double result = 0;     
        switch(planet){
            case 1:
            result = weight*0.78;
            break;
            case 2:
            result = weight*0.39;
            break;
            case 3:
            result = weight*3.65;
            break;
            case 4:
            result = weight*1.17;
            break;
            case 5:
            result = weight*1.05;
            break;
            case 6:
            result = weight*1.23;
            break;
        }
        return result;
    }

  public static void main(String[] arg){

     System.out.print("Please enter your current earth weitht: ");
     double weight = keyboard.nextDouble();

     System.out.println("I have information for the following planets:");
     System.out.println("1. Venus   2. Mars    3. Jupiter");
     System.out.println("4. Saturn  5. Uranus  6. Neptune");


     System.out.print("Which planet are you visiting? ");
     int planet = keyboard.nextInt();

     System.out.println("Your weight would be "+calWeight(planet, weight)+" pounds on that planet.");

     
 }

}

// Please enter your current earth weight: 128

// I have information for the following planets:
//    1. Venus   2. Mars    3. Jupiter
//    4. Saturn  5. Uranus  6. Neptune

// Which planet are you visiting? 2

// Your weight would be 49.92 pounds on that planet.