
/**
 * FibNums class.
 *
 * @author Domenic Iorfida
 * @version 3/25/21
 */
import java.util.Scanner;
public class FibonacciNums
{
    public int findFibonacciNum(int n)
    {
        if(n == 0 || n == 1)
            return n;
        return findFibonacciNum(n - 1) + findFibonacciNum(n - 2);
    }
    
    public static void main(String[] args)
    {
        FibonacciNums fibNum = new FibonacciNums();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Fibonacci nth Number Calculator\n");
        
        boolean terminate = false;
        while(!terminate) // 46 is the limit
        {
            System.out.print("Please enter the nth number to find (0 - 46) \nor enter -1 to quit: ");
            int num = in.nextInt();
            if(num == -1)
                terminate = true;
            else if(num > 46 || num < -1)
                System.out.println("\nInput is out of range. Please try again.\n");
            else
            {
                System.out.println("Please wait...");
                System.out.println("Fibonacci number at n = " + num + " is " + fibNum.findFibonacciNum(num) + "\n");
            }
        }
        
        System.out.println("\nProgram terminated. Have a great day.");
    }
}
