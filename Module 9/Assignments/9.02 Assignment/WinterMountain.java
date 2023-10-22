
/**
 * Winter Mountain class.
 *
 * @author Domenic Iorfida
 * @version 2/24/21
 */
public class WinterMountain extends Mountain
{
    private double temperature;
    
    public WinterMountain(int length, int width, int num, double temp)
    {
        super(length, width, num);
        temperature = temp;
    }
    
    public String getWinterMountainSize()
    {
        return "Winter Mountain " + getMountainSize() + " and temperature " + temperature + " degrees";
    }
}
