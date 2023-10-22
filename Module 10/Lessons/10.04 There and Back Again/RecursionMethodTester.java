
/**
 * This class tests the recursive method for
 * the given Piecewise function.
 *
 * @author Elle Navan
 * @version 06/12/17
 */
class RecursiveMethods
{
    RecursiveMethods()          // default constructor
    {
    }

    public int fOf(int x)
    {
        if (x <= 7)            // the base case
        {
            //System.out.println(x + " <= 10, therefore ... f(" + x + ") = -5");
            return -5;
        }
        else
        {
            //System.out.println(x + " > 10, therefore ... f(" + x + ") = f(" + x + " - 3) + 2 = f(" + (x -3) + ") + 2");
            return fOf(x-6) + 1;   // recursive call
        }
    }
}

public class RecursionMethodTester
{
    public static void main(String[] args)
    {
        int x;
        RecursiveMethods rMethods = new RecursiveMethods();

        x = 25;
        
        System.out.println(rMethods.fOf(x));
    }
}
