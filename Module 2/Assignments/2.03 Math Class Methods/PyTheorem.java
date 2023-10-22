
/**
 * Program that calculates the hypotenuse of a right triangle with randomly
 * generated side lengths.
 *
 * @author Domenic Iorfida
 * @version 9/16/20
 */
public class PyTheorem
{
    public static void main()
    {
        int t1SideA = (int) (Math.random() * 17) + 5;
        int t1SideB = (int) (Math.random() * 17) + 5;
        double t1Hypo = Math.sqrt(Math.pow(t1SideA, 2) + Math.pow(t1SideB, 2));
        
        int t2SideA = (int) (Math.random() * 17) + 5;
        int t2SideB = (int) (Math.random() * 17)  + 5;
        double t2Hypo = Math.sqrt(Math.pow(t2SideA, 2) + Math.pow(t2SideB, 2));
        
        System.out.print("Triangle 1:       ");
        System.out.print("Side 1: " + t1SideA + "       ");
        System.out.print("Side 2: " + t1SideB + "       ");
        System.out.println("Hypotenuse: " + t1Hypo);
        
        System.out.print("Triangle 2:       ");
        System.out.print("Side 1: " + t2SideA + "       ");
        System.out.print("Side 2: " + t2SideB + "       ");
        System.out.println("Hypotenuse: " + t2Hypo);
    }
}
