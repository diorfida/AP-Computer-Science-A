
/**
 * Game Terrain Tester class.
 *
 * @author Domenic Iorfida
 * @version 2/25/21
 */
public class GameTerrainTester
{
    public static void main(String[] args)
    {
        Terrain terrain = new Terrain(555, 642);
        Mountain mountain = new Mountain(169, 367, 3);
        Forest forest = new Forest(631, 95, 39);
        WinterMountain winterMountain = new WinterMountain(2632, 62, 62, 23);
        Beach beach = new Beach(369, 51, true);
        SurferBeach surferBeach = new SurferBeach(626, 95, false, 23);
        
        System.out.println(terrain.getTerrainSize() + "\n");
        System.out.println(mountain.getMountainSize() + "\n");
        System.out.println(forest.getForestSize() + "\n");
        System.out.println(winterMountain.getWinterMountainSize() + "\n");
        System.out.println(beach.getBeachSize() + "\n");
        System.out.println(surferBeach.getSurferBeachSize() + "\n");
    }
}
