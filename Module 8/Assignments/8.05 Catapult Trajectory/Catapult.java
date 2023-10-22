
/**
 * Catapult object
 *
 * @author Domenic Iorfida
 * @version (a version number or a date)
 */
public class Catapult
{
    private int angle;
    private int speed;
    
    private static final double g = 9.8;
    
    public Catapult(int angle, int speed)
    {
        this.angle = angle;
        this.speed = speed;
    }
    
    public int getAngle(){return angle;}
    public int getSpeed(){return speed;}
    
    public void setAngle(int newAngle){angle = newAngle;}
    public void setSpeed(int newSpeed){speed = newSpeed;}
    
    public double getTrajectory()
    {
        double temp = (Math.pow(toMetersPerSec(speed), 2) * Math.sin(2 * Math.toRadians(angle))) / g;
        temp *= 3.2808; // to get to feet from meters
        return temp;
    }
    
    private double toMetersPerSec(double mph)
    {
        return mph / 2.237;
    }
}
