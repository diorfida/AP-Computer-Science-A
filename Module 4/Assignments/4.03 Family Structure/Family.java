
/**
 * Program to calculate the gender structure of a family.
 *
 * @author Domenic Iorfida
 * @version 10/20/20
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main() throws IOException {
        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        
        int totalFams = 0;
        int twoBoys = 0;
        int twoGirls = 0;
        int oneBoyOneGirl = 0;
        
        System.out.println("Composition statistics for families with two children.\n");
        
        while(inFile.hasNext()){
            token = inFile.next();
            if(token.equals("BB"))
                twoBoys ++;
            else if(token.equals("GG"))
                twoGirls ++;
            else
                oneBoyOneGirl ++;
            totalFams ++;
        }
        
        System.out.println("Total number of families: " + totalFams + "\n");
        
        System.out.println("Number of families with");
        
        double percent2Boys = (double) twoBoys / totalFams * 100;
        System.out.print("           ");
        System.out.print("2 boys: " + twoBoys + " represents ");
        System.out.printf("%.2f", percent2Boys);
        System.out.println("%");
        
        double percent2Girls = (double) twoGirls / totalFams * 100;
        System.out.print("          ");
        System.out.print("2 girls: " + twoGirls + " represents ");
        System.out.printf("%.2f", percent2Girls);
        System.out.println("%");
        
        double percent1Each = (double) oneBoyOneGirl / totalFams * 100;
        System.out.print(" ");
        System.out.print("1 boy and 1 girl: " + oneBoyOneGirl + " represents ");
        System.out.printf("%.2f", percent1Each);
        System.out.println("%");
    }
}
