
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(){
        for(int outer = 0; outer < 5; outer += 2){
            for(int inner = 0; inner < outer + 1; inner ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
