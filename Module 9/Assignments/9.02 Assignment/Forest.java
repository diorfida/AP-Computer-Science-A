
/**
 * Forest class.
 *
 * @author Domenic Iorfida
 * @version 2/24/21
 */
public class Forest extends Terrain
{
    private int numTrees;
    
    public Forest(int length, int width, int num)
    {
        super(length, width);
        numTrees = num;
    }
    
    public String getForestSize()
    {
        return "Forest " + getTerrainSize() + " and has " + numTrees + " trees";
    }
}
