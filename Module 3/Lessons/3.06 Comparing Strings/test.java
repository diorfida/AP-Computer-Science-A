
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(){
        String word = "sunflower";
        String x = word.substring(3);
        String y = word.substring(3, 9);
        
        if (x == y)
            System.out.print(1);
        else if (x.equals(y))
            System.out.print(2);
        else
            System.out.print(3);
    }
}
