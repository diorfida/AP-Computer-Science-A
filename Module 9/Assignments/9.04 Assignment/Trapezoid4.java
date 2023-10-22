
/**
 * Parallelogram Prism object.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trapezoid4 extends Rectangle4
{
    private int topLength;
    private int bottomLength;
    private int leftSideLength;
    private int rightSideLength;
    
    public Trapezoid4(int l, int w, int topLength, int bottomLength, int leftSideLength, int rightSideLength)
    {
        super(l, w);
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.leftSideLength = leftSideLength;
        this.rightSideLength = rightSideLength;
    }
    
    public int getTopLength(){return topLength;}
    public int getBottomLength(){return bottomLength;}
    public int getLeftSideLength(){return leftSideLength;}
    public int getRightSideLength(){return rightSideLength;}
    
    public String toString()
    {
        return "Trapezoid - " + getLength() + " X " + getWidth() + " with side lengths " + topLength + " (top) " + rightSideLength + " (right) " + bottomLength + " (bottom) " + leftSideLength +  " (left)";
    }
    
    public boolean equals(Object b)
    {
        if( ! (b instanceof Trapezoid4))
            return false;
        
        Trapezoid4 t = (Trapezoid4)b;
        return t.getLength() == getLength() && t.getWidth() == getWidth() && t.getTopLength() == getTopLength() && t.getRightSideLength() == getRightSideLength() && t.getBottomLength() == getBottomLength() && t.getLeftSideLength() == getLeftSideLength();
    }
}
