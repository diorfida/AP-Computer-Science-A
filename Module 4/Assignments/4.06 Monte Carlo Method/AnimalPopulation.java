
/**
 * Program that uses the Monte Carlo Method to simulate counting squirrels
 * until a fox squirrel is found for multiple trials.
 *
 * @author Domenic Iorfida
 * @version 10/23/20
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
public class AnimalPopulation
{
    public static void main() throws IOException{
        Scanner in = new Scanner(System.in);
        File fileName = new File("rawData.txt");
        Scanner inFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter(fileName);
        Random randNumList = new Random();
        
        System.out.println("Welcome to the Fox Squirrel Simulator\n");
        
        int targetTrialSims = 0;
        int total = 0;
        boolean properNum = false;
        
        while(!properNum){
            System.out.println("How many trials should be simulated?");
            System.out.println("Enter a value greater than 1000: ");
            
            targetTrialSims = in.nextInt();
            if(targetTrialSims < 1000){
                System.out.println("\n Please try again. Enter a number greater than 1000.\n");
            }else{
                System.out.println("\nsimulating trials now... one moment please...\n");
                properNum = true;
            }
        }
        int totalSims = 0;
        while(totalSims < targetTrialSims){
            boolean foxSquirrel = false;
            for(int totalAnimals = 0; !foxSquirrel; totalAnimals ++){
                int randomAnimal = randNumList.nextInt(11);
                if(randomAnimal == 10){
                    outFile.println(totalAnimals);
                    foxSquirrel = true;
                }
            }
            totalSims ++;
        }
        outFile.close();
        while(inFile.hasNextInt()){
            int token = inFile.nextInt();
            total += token;
        }
        double average = (double)total / totalSims;
        
        System.out.println("The results!");
        System.out.println("The average number of squirrels observed until");
        System.out.print("spotting a Fox Squirrel at the city park is: ");
        System.out.printf("%.3f", average);
    }
}
