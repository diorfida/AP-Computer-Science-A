
/**
 * Calculates the primes in a number range.
 *
 * @author Domenic Iorfida
 * @version 3/9/21
 */
import java.util.ArrayList;
public class PrimeCalculator
{
    public static int[] calcPrimes(int lower, int upper)
    {
        ArrayList<Integer> allNums = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int num = lower; num <= upper; num ++)
            allNums.add(num);
            
        for(int num : allNums)
        {
            int check = 0;
            if(num > 1)
            {
                for(int i = 2; i < num; i ++)
                {
                    if(num % i == 0){
                        check ++;
                        break;
                    }
                }
            }
            else
                check = 1;
            if(check == 0)
                primes.add(num);
        }
        
        int[] returnArray = new int[primes.size()];
        for(int i = 0; i < primes.size(); i ++)
            returnArray[i] = primes.get(i);
            
        return returnArray;
    }
}
