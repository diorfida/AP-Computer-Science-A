
/**
 * Write a description of class CalculationsV5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculationsV5
{
    public static void main()
    {
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2) ); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0) );
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println("43.21 / 10.0 = " + (43.21 / 10.0) );
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println("10.0 % 3.14" + (10.0 % 3.14) );
        System.out.println();
        
        // 1.08 Additional int Equations
        int newInum1 = 48;
        int newInum2 = 15;
        System.out.println("Additional int Equations");
        System.out.println("(" + newInum1 + " + " + newInum2 + ")" + " / " + newInum2 + " = " + ((newInum1 + newInum2) / newInum2));
        System.out.println(newInum1 + " % " + newInum2 + " = " + newInum1 % newInum2);
        System.out.println(newInum2 + " * " + newInum2 + " = " + newInum1 * newInum2);
        
        // 1.09 Additional double Equations
        
               
    } // end of main method
}
