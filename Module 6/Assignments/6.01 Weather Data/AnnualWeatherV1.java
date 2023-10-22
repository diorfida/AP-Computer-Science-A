
/**
 * Write a description of class AnnualWeatherV1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnnualWeatherV1
{
    public static void main(String[] args)
    {
        String[] monthsAbbreviated = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double[] daytonaTempF = {58.4, 60.0, 64.7, 68.9, 74.8, 79.7, 81.7, 81.5, 79.9, 74.0, 67.0, 60.8};
        double[] daytonaPrecipInch = {3.1, 2.7, 3.8, 2.5, 3.3, 5.7, 5.2, 6.1, 6.6, 4.5, 3.0, 2.7};
        
        double averageTempF = 0;
        for(int count = 0; count < daytonaTempF.length; count ++){
            averageTempF += daytonaTempF[count];
        }
        averageTempF /= daytonaTempF.length;
        
        double totalPrecipInch = 0;
        for(int count = 0; count < daytonaPrecipInch.length; count ++){
            totalPrecipInch += daytonaPrecipInch[count];
        }
        
        System.out.println("            Weather Data");
        System.out.println("     Location: Daytona Beach, Florida");
        System.out.println("Month      Temperature (F)  Precipitation (in.)");
        System.out.println("************************************************");
        for(int printer = 0; printer < monthsAbbreviated.length && printer < daytonaTempF.length && printer < daytonaPrecipInch.length; printer ++){
            System.out.print(monthsAbbreviated[printer] + "\t\t");
            System.out.print(daytonaTempF[printer] + "\t\t");
            System.out.println(daytonaPrecipInch[printer]);
        }
        System.out.println("************************************************");
        System.out.print("      Average: " + averageTempF);
        System.out.println("\t  Total: " + totalPrecipInch);
    }
}
