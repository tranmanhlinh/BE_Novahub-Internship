import java.util.Scanner;

public class BMI{
    static Scanner keyboard = new Scanner(System.in);
  public static void main(String[] arg){
     
     System.out.print("Your height in m: ");
     double height = keyboard.nextDouble();
     System.out.print("Your weight in kg: ");
     double weight = keyboard.nextDouble();   

     double BMI = weight/(height*height);
     System.out.println("Your BMI is: "+BMI);

     if(BMI < 15) System.out.println("BMI Category: very severely underweight");
     else if(BMI <= 16) System.out.println("BMI Category: severely underweight");
     else if(BMI <= 18.4) System.out.println("BMI Category: underweight");
     else if(BMI <= 24.9) System.out.println("BMI Category: normal weight");
     else if(BMI <= 29.9) System.out.println("BMI Category: overweight");
     else if(BMI <= 34.9) System.out.println("BMI Category: moderately obese");
     else if(BMI <= 39.9) System.out.println("BMI Category: severely obese");
     else System.out.println("BMI Category: very severely (or \"morbidly\") obese");     
 }

}

// BMI	category
// less than 15.0	very severely underweight
// 15.0 to 16.0	severely underweight
// 16.1 to 18.4	underweight
// 18.5 to 24.9	normal weight
// 25.0 to 29.9	overweight
// 30.0 to 34.9	moderately obese
// 35.0 to 39.9	severely obese
// 40.0 and up	very severely (or "morbidly") obese