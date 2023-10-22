/**
 * Tester for the Hurricane class
 * 
 * @author Domenic Iorfida
 * @date 2/5/21
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class HurricaneTester
{
    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed
        for(int i = 0; i < windSpeeds.length; i ++)
        {
            windSpeeds[i] *= 1.151;
        }
        
        //determine categories
        int[] categories = new int[numValues];
        for(int i = 0; i < categories.length; i++)
        {
            if(windSpeeds[i] >= 74 && windSpeeds[i] <= 95){
                categories[i] = 1;
            }else if(windSpeeds[i] >= 96 && windSpeeds[i] <= 110){
                categories[i] = 2;
            }else if(windSpeeds[i] >= 111 && windSpeeds[i] <= 129){
                categories[i] = 3;
            }else if(windSpeeds[i] >= 130 && windSpeeds[i] <= 156){
                categories[i] = 4;
            }else{
                categories[i] = 5;
            }
        }
        
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricaneList = new ArrayList<Hurricane>();
        
        //user prompted for range of years
        Scanner in = new Scanner(System.in);
        boolean terminate = false;
        int yearFirst = 0;
        int yearEnd = 0;
        while(!terminate)
        {
            System.out.println("What is the range of years? Pick between 1995 and 2019");
            System.out.print("Format your input like this: 1995 2019 ==>");
            String firstYear = in.next();
            String endYear = in.next();
            yearFirst = Integer.parseInt(firstYear);
            yearEnd = Integer.parseInt(endYear);
            
            if(yearFirst < 1995 || yearFirst > 2019 || yearEnd < 1995 || yearEnd > 2019){
                System.out.println("\nInvalid year range. Please try again.\n");
            }else if(yearFirst > yearEnd){
                System.out.println("\nFirst year is greater than last year. Please try again.\n");
            }else{
                System.out.println("\n");
                terminate = true;
            }
        }
        
        for(int i = 0; i < years.length; i++)
        {
            if(years[i] < yearFirst || years[i] > yearEnd){
                //do nothing
            }else{
                hurricaneList.add(new Hurricane(years[i], names[i], months[i], categories[i], pressures[i], windSpeeds[i]));
            }
        }
        
        //calculate sums
        int totalCat = 0;
        int minCat = Integer.MAX_VALUE;
        int maxCat = Integer.MIN_VALUE;
        
        int totalPressure = 0;
        int minPressure = Integer.MAX_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        
        double totalWind = 0.0;
        double minWind = Double.MAX_VALUE;
        double maxWind = Double.MIN_VALUE;
        for(int i = 0; i < hurricaneList.size(); i++)
        {
            int category = hurricaneList.get(i).getCat();
            int pressure = hurricaneList.get(i).getPressure();
            double wind = hurricaneList.get(i).getWindspeed();
            
            totalCat += category;
            if(category < minCat)
                minCat = category;
            if(category > maxCat)
                maxCat = category;
                
            totalPressure += pressure;
            if(pressure < minPressure)
                minPressure = pressure;
            if(pressure > maxPressure)
                maxPressure = pressure;
                
            totalWind += wind;
            if(wind < minWind)
                minWind = wind;
            if(wind > maxWind)
                maxWind = wind;
        }
        double averageCat = totalCat / hurricaneList.size();
        double averagePressure = totalPressure / hurricaneList.size();
        double averageWind = totalWind / hurricaneList.size();
        
        //print the data
        System.out.println("                           Hurricanes " + yearFirst + " - " + yearEnd + "\n");
        System.out.println(" Year\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("================================================================================");
        
        for(Hurricane hurricane : hurricaneList){
            System.out.println(hurricane.toString());
        }
        
        System.out.println("================================================================================");
        System.out.printf("\tAverage: %12.1f\t %14.1f %15.2f\n", averageCat, averagePressure, averageWind);
        System.out.printf("\tMinimum: %12d\t %14d %15.2f\n", minCat, minPressure, minWind);
        System.out.printf("\tMaximum: %12d\t %14d %15.2f\n", maxCat, maxPressure, maxWind);
     }
}