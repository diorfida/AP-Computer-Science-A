/**
 * @purpose: Tester to create PlanetV7 objects with two parameter constructor and calcRadius() method with no parameters.
 *
 * @author APCS Team
 * @version FLVS 2020
 */
 
 
public class PlanetTesterV7b
{
   
   public static void main (String [] args) {
   
      
       String name1 = "Jupiter";
       int diam1 = 142984;
       
       String name2 = "Mars";
       int diam2 = 6794;
       
       double radius = 0.0;
       
       PlanetV7 spaceA = new PlanetV7(name1, diam1);
       radius = spaceA.calcRadius();  // no need to have the diameter parameter because it's passed into the two parameter constructor
       System.out.println("Planet: " + name1 + "\t Radius: " + radius);
       
       
       PlanetV7 spaceB = new PlanetV7(name2, diam2);
       radius = spaceB.calcRadius();  // no need to have the diameter parameter because it's passed into the two parameter constructor
       System.out.println("Planet: " + name2 + "\t\t Radius: " + radius);

   
   
   }
    
    
}
