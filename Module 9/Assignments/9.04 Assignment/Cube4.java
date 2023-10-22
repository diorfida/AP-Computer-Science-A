
/**
 * Write a description of class Cube4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube4 extends Box4
{
    public Cube4(int s)
    {
        super(s, s, s);
    }
    
    public int getSideLength(){return getLength();}
    
    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
