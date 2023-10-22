
/**
 * Beach terrain class.
 *
 * @author Domenic Iorfida
 * @version 2/25/21
 */
public class Beach extends Terrain
{
    private boolean myHighTide;
    
    public Beach(int length, int width, boolean highTide)
    {
        super(length, width);
        myHighTide = highTide;
    }
    
    public boolean getHighTide(){return myHighTide;}
    
    public String getBeachSize()
    {
        if(myHighTide)
            return "Beach " + getTerrainSize() + " and is at high tide";
        else
            return "Beach " + getTerrainSize() + " and is not at high tide";
    }
}
