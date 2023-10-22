
/**
 * Catapult object runner.
 *
 * @author Domenic Iorfida
 * @version 2/16/21
 */
public class CatapultTester
{
    public static void main(String[] args)
    {
        int[] degrees = {25, 30, 35, 40, 45, 50};
        int[] mph = {20, 25, 30, 35, 40, 45, 50};
        
        Catapult[][] projectiles = new Catapult[mph.length][degrees.length];
        for(int s = 0; s < mph.length; s++){
            for(int a = 0; a < degrees.length; a ++){
                projectiles[s][a] = new Catapult(degrees[a], mph[s]);
            }
        }
        
        printTable(projectiles, degrees, mph);
    }
    
    public static void printTable(Catapult[][] source, int[] degrees, int[] mph)
    {
        System.out.printf("%5s", "MPH");
        
        for(int temp : degrees)
        {
            System.out.printf("%10d deg", temp);
        }
        System.out.println("\n============================================================================================");
        
        for(int row = 0; row < source.length; row ++)
        {
            System.out.printf(" % -10d ", mph[row]);

            for(int col = 0; col < source[row].length; col ++)
            {
                System.out.printf("%- 14.2f", source[row][col].getTrajectory());
            }
            System.out.println();
        }
    }
}
