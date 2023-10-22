
/**
 * Parallelogram object.
 *
 * @author Domenic Iorfida
 * @version 3/2/21
 */
public class Parallelogram4 extends Trapezoid4
{
    private int side1;
    private int side2;
    
    public Parallelogram4(int l, int w, int s1, int s2)
    {
        super(l, w, s1, s1, s2, s2);
        side1 = s1;
        side2 = s2;
    }
    
    public int getSide1(){return side1;}
    public int getSide2(){return side2;}
    
    public String toString()
    {
        return "Parallelogram - " + getLength() + " X " + getWidth() + " with side lengths " + side1 + " and " + side2;
    }
}
