
/**
 * Surfer Beach class.
 *
 * @author Domenic Iorfida
 * @version 2/25/21
 */
public class SurferBeach extends Beach
{
    private int waveHeight;
    
    public SurferBeach(int length, int width, boolean highTide, int wh)
    {
        super(length, width, highTide);
        waveHeight = wh;
    }
    
    public String getSurferBeachSize()
    {
        String temp = "Surfer Beach " + getTerrainSize();
        if(getHighTide())
            temp += " and has a wave height of " + waveHeight + " in";
        else
            temp += " but still has a wave height of " + waveHeight + " in";
        return temp;
    }
}
