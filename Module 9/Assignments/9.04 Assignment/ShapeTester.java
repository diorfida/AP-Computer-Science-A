
/**
 * ShapeTester class.
 *
 * @author Domenic Iorfida
 * @version 3/1/21
 */
import java.util.ArrayList;
public class ShapeTester
{
    public static void main(String[] args)
    {
        Rectangle4 rect = new Rectangle4(20, 10);
        Box4 box1 = new Box4(5, 5, 5);
        Box4 box2 = new Box4(10, 42, 29);
        Cube4 cube = new Cube4(5);
        Trapezoid4 trap1 = new Trapezoid4(29, 53, 23, 45, 34, 54);
        Trapezoid4 trap2 = new Trapezoid4(25, 10, 15, 15, 6, 6);
        Parallelogram4 parallel = new Parallelogram4(25, 10, 15, 6);
        
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        shapes.add(rect);
        shapes.add(box1);
        shapes.add(box2);
        shapes.add(cube);
        shapes.add(trap1);
        shapes.add(trap2);
        shapes.add(parallel);
        
        System.out.println("My shapes: \n");
        for(Rectangle4 s : shapes){
            showEffectBoth(s);
        }
        
        System.out.println("\n\nTest for equality: \n");
        compare(box1, cube);
        compare(box2, cube);
        compare(trap1, parallel);
        compare(trap2, parallel);
    }
    
    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }
    
    public static void compare(Rectangle4 r1, Rectangle4 r2)
    {
        if(r1.equals(r2))
            System.out.println(r1 + " IS the same size as " + r2 + "\n");
        else
            System.out.println(r1 + " IS NOT the same size as " + r2 + "\n");
    }
}
