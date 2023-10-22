
/**
 * Client class for all of the shapes.
 *
 * @author Domenic Iorfida
 * @version 3/1/21
 */
import java.util.ArrayList;
public class ShapesTester
{
    public static void main(String[] args)
    {
        Circle2 circle = new Circle2(10, 10, 40);
        Circle2 cylinder = new Cylinder2(21, 32, 43, 1);
        Circle2 oval = new Oval2(23, 94, 23, 66);
        Circle2 ovalCylinder = new OvalCylinder2(65, 38, 23, 43, 55);
        
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(circle);
        shapes.add(cylinder);
        shapes.add(oval);
        shapes.add(ovalCylinder);
        
        for(Circle2 object : shapes)
        {
            showCenter(object);
        }
    }
    
    public static void showCenter(Circle2 c)
    {
        System.out.println("For this " + c.getName() + " the center is at " + c.getCenter() + ".");
    }
}
