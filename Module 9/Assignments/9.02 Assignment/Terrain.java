
/**
 * Thic class defines a basic Terrain.
 *
 * @author Domenic Iorfida
 * @version 2/24/21
 */
public class Terrain
{
    // instance variables
    private int length, width;

    /**
     * Constructor for objects of class Terrain
     */
    public Terrain(int l, int w)
    {
        // initialise instance variables
        length = l;
        width = w;
    }

    public String getTerrainSize()
    {
        return "Land has dimensions " + length + " X " + width;
    }
}
