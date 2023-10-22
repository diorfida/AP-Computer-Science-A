/**
 * @purpose: Tester to create PlanetV7 objects with single parameter constructor and overloaded calcRadius() method.
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV7a
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       String name2 = "Mars";
       int diam2 = 6794;
       
       double radius = 0.0;
       
       PlanetV7 spaceA = new PlanetV7(name1);
       radius = spaceA.calcRadius(diam1);
       System.out.println("Planet: " + name1 + "\t Radius: " + radius);
       
       
       PlanetV7 spaceB = new PlanetV7(name2);
       radius = spaceB.calcRadius(diam2);
       System.out.println("Planet: " + name2 + "\t\t Radius: " + radius);

   
   
   }
    
    
}
