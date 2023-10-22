
/**
 * Program that determines the surface gravity in grams on Mars.
 *
 * @author Domenic Iorfida
 * @version 11/2/20
 */
public class PlanetGravity
{
    public static void main(){
        String planet = "Mars";
        double diameter = 6794.0;
        double mass = Math.pow(6.4219, 23);
        double surfaceGravity = calcSurfaceGravity(mass, diameter / 2);
        
        printAll(planet, diameter, mass, surfaceGravity);
    }
    
    public static void printAll(String planet, double diameter, double mass, double surfaceGravity){
        System.out.println("                        Planetary Data");
        System.out.println(" Planet \tDiameter (km) \tMass (kg) \tg (m/s^2)");
        System.out.println("------------------------------------------------------------");
        
        System.out.print("  " + planet + "\t\t");
        System.out.print(diameter + "\t\t");
        System.out.printf("%6.3e", mass); 
        System.out.print("\t ");
        System.out.printf("%.2f", surfaceGravity);
        
    }
    
    public static double calcSurfaceGravity(double mass, double radius){
        double G = 6.67 * Math.pow(10, -11);
        
        return G * mass / Math.pow(radius, 2);
    }
}
