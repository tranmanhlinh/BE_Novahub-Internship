import java.util.Scanner;

public class BMICalculator{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("Your height in m: ");
     double height = keyboard.nextDouble();
     System.out.print("Your weight in kg: ");
     double weight = keyboard.nextDouble();
     

     System.out.println("Your BMI is "+weight/(height*height));
     
 }

}

// Your height in m: 1.75
// Your weight in kg: 73

// Your BMI is 23.83673