
/**
 * Program that calculates total daily energy expenditure.
 *
 * @author Domenic Iorfida
 * @version 10/6/20
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        double activityFactor;
        
        System.out.println("Please enter your name: ");
        String name = in.nextLine();
        
        System.out.println("Please enter your BMR: ");
        double bmr = Double.parseDouble(in.next());
        
        System.out.println("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase();
        
        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        
        System.out.println("\nEnter the letter corresponding to your activity level: ");
        String activityLevel = in.next().toUpperCase();
        
        if (activityLevel.equals("A"))
            activityFactor = 1.0;
        else if (activityLevel.equals("B"))
            activityFactor = 1.3;
        else if (activityLevel.equals("C") && gender.equals("F"))
            activityFactor = 1.5;
        else if ((activityLevel.equals("C") && gender.equals("M")) || (activityLevel.equals("D") && gender.equals("F")))
            activityFactor = 1.6;
        else if (activityLevel.equals("D") && gender.equals("M"))
            activityFactor = 1.7;
        else if (activityLevel.equals("E") && gender.equals("F"))
            activityFactor = 1.9;
        else if (activityLevel.equals("E") && gender.equals("M"))
            activityFactor = 2.1;
        else if (activityLevel.equals("F") && gender.equals("F"))
            activityFactor = 2.2;
        else
            activityFactor = 2.4;
        
        double tdee = bmr * activityFactor;
        
        System.out.println("\n\nYour results: ");
        System.out.print("Name: " + name + "        ");
        System.out.println("Gender: " + gender);
        System.out.print("BMR: " + bmr + " calories" + "      ");
        System.out.println("Activity Factor: " + activityFactor);
        System.out.println("TDEE: " + tdee + " calories");
    }
}
