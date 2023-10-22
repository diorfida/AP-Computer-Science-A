
/**
 * Calculates the Body Mass Index of some user inputs.
 *
 * @author Domenic Iorfida
 * @version 10/2/20
 */
import java.util.Scanner;
public class BMI
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        String fullName = firstName + lastName;
        
        System.out.println("Enter your weight in pounds (e.g. 175): ");
        String weightInput = in.next();
        int weightLbs = Integer.parseInt(weightInput);
        
        System.out.println("Enter your height in feet annd inches (e.g. 5 11): ");
        String heightFeetInput = in.next();
        String heightInchInput = in.nextLine();
        int heightFeet = Integer.parseInt(heightFeetInput);
        int justHeightInches = Integer.parseInt(heightInchInput.substring(1));
        int totalHeightInches = (heightFeet * 12) + justHeightInches;
        
        double heightM = (2.54 * totalHeightInches) / 100;
        double weightKg = 0.45359237 * weightLbs;
        
        double bmi = weightKg / (heightM * heightM);
        String bmiInterpreter = null;
        
        if (bmi < 18.5)
            bmiInterpreter = "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            bmiInterpreter = "Healthy Weight";
        else if (bmi >= 25.0 && bmi <= 29.9)
            bmiInterpreter = "Overweight";
        else if (bmi >= 29.9)
            bmiInterpreter = "Obese";
        
        ////////////////////////////////////////////////////////////////////
        
        System.out.println("\nBody Mass Index Calculator");
        System.out.println("===========================");
        
        System.out.println("Name: " + fullName);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg): " + weightKg);
        
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + bmiInterpreter);
    }
}
