
/**
 * Program that outputs the temperature and precipitation scale for a specific
 * place, based on the user's input.
 *
 * @author Domenic Iorfida
 * @version 1/6/21
 */
import java.util.Scanner;
public class AnnualWeatherV2
{
    public static double calcAverageTemp(double[] temps)
    {
        double averageTemp = 0;
        for(int count = 0; count < temps.length; count ++){
            averageTemp += temps[count];
        }
        averageTemp /= temps.length;
        return averageTemp;
    }
    
    public static double calcTotalPrecipitation(double[] precip)
    {
        double totalPrecip = 0;
        for(int count = 0; count < precip.length; count ++){
            totalPrecip += precip[count];
        }
        return totalPrecip;
    }
    
    public static void printResults(String[] monthsAbbreviated, double[] daytonaTempF, double[] daytonaPrecipInch, double averageTemp, double totalPrecip, String tempIdentifier, String precipIdentifier)
    {
        if(precipIdentifier.equals("I"))
            precipIdentifier = "in.";
        else
            precipIdentifier = "cm.";
        
        System.out.println("            Weather Data");
        System.out.println("     Location: Daytona Beach, Florida\n");
        System.out.printf("%5s\t", "Month");
        System.out.printf("%20s\t", "Temperature (" + tempIdentifier + ")");
        System.out.printf("%24s\n", "Precipitation (" + precipIdentifier + ")");
        System.out.println("*********************************************************");
        for(int printer = 0; printer < monthsAbbreviated.length && printer < daytonaTempF.length && printer < daytonaPrecipInch.length; printer ++){
            System.out.printf("%-5s", monthsAbbreviated[printer]);
            System.out.printf("%20.1f", daytonaTempF[printer]);
            System.out.printf("%24.1f\n", daytonaPrecipInch[printer]);
        }
        System.out.println("*****************************************************");
        System.out.printf("\tAverage: %8.1f", averageTemp);
        System.out.printf("\tAnnual: %9.1f\n", totalPrecip);
    }
    
    public static double[] temperaturesToCelcius(double[] tempsF)
    {
        double[] tempsC = new double[tempsF.length];
        for(int counter = 0; counter < tempsF.length; counter ++){
            tempsC[counter] = tempsF[counter] * (5.0/9);
        }
        return tempsC;
    }
    
    public static double[] precipsToCentimeters(double[] precipInch)
    {
        double[] precipCm = new double[precipInch.length];
        for(int counter = 0; counter < precipInch.length; counter ++){
            precipCm[counter] = precipInch[counter] * 2.54;
        }
        return precipCm;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String[] monthsAbbreviated = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double[] daytonaTempF = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};
        double[] daytonaPrecipInch = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};
        
        System.out.print("Choose the temperature scale (F = Farenheight, C = Celsius): ");
        String tempInput = in.next().toUpperCase();
        
        System.out.print("Choose the precipitation scale (i = inches, c = centimeters): ");
        String precipInput = in.next().toUpperCase();
        
        System.out.println("\n");
        
        if(tempInput.equals("C"))
            daytonaTempF = temperaturesToCelcius(daytonaTempF);
        
        if(precipInput.equals("C"))
            daytonaPrecipInch = precipsToCentimeters(daytonaPrecipInch);
        
        double averageTemp = calcAverageTemp(daytonaTempF);
        double totalPrecip = calcTotalPrecipitation(daytonaPrecipInch);
        
        printResults(monthsAbbreviated, daytonaTempF, daytonaPrecipInch, averageTemp, totalPrecip, tempInput, precipInput);
    }
}
