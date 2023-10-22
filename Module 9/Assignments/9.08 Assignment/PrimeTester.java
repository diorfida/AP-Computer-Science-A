
/**
 * Prime Number Calculator Runner.
 *
 * @author Domenic Iorfida
 * @version 3/9/21
 */
import java.util.Scanner;
public class PrimeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Prime Numbers Calculator\n");
        System.out.println("You will now enter a lower and upper limit.");
        
        System.out.print("Lower: ");
        int low = in.nextInt();
        
        boolean temp = false;
        int high = 0;
        while(!temp){
            System.out.print("Upper: ");
            high = in.nextInt();
            
            if(high <= low)
                System.out.println("Please enter a number greater than the lower limit");
            else
                temp = true;
        }
        
        System.out.println("\nCalculating Primes...\n");
        
        int[] primes = PrimeCalculator.calcPrimes(low, high);
        
        System.out.print("Prime numbers in the range " + low + " to " + high + ": \n");
        
        for(int num : primes)
            System.out.print(num + " ");
        
        System.out.println("\nTotal count of prime numbers in this set: " + primes.length);
    }
}
