
/**
 * Mountain class.
 *
 * @author Domenic Iorfida
 * @version 2/24/21
 */
public class Mountain extends Terrain
{
    private int numMountains;
    
    public Mountain(int length, int width, int num)
    {
        super(length, width);
        numMountains = num;
    }
    
    public String getMountainSize()
    {
        return "Mountain " + getTerrainSize() + " and has " + numMountains + " mountains";
    }
}
