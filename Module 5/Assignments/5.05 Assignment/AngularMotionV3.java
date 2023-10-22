
/**
 * Program that converts rpm values to velocity values.
 *
 * @author Domenic Iorfida
 * @version 11/5/20
 */
public class AngularMotionV3
{
    public AngularMotionV3(){}

    public double toRadiansPerSecond(double rpm){
        return (2 * Math.PI / 60) * rpm;
    }
    
    public double toDegreesPerSecond(double radPerSec, double wheelRadius){ // velocity
        return radPerSec * wheelRadius;
    }
    
    public static void main(){
        double rpm1 = 6000;
        double rpm2 = 4300;
        double wheelRadius = 2;
        
        AngularMotionV3 motionCalc = new AngularMotionV3();
        double radPerSec1 = motionCalc.toRadiansPerSecond(rpm1);
        double velo1 = motionCalc.toDegreesPerSecond(radPerSec1, wheelRadius);
        
        double radPerSec2 = motionCalc.toRadiansPerSecond(rpm2);
        double velo2 = motionCalc.toDegreesPerSecond(radPerSec2, wheelRadius);
        
        System.out.println("           Calculator Results:");
        System.out.println("RPM \t Radians/Second \t Velocity");
        System.out.println(rpm1 + " \t " + radPerSec1 + " \t " + velo1);
        System.out.println(rpm2 + " \t " + radPerSec2 + " \t " + velo2);
    }
}
