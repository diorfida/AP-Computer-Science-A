
/**
 * Practice with calculations, concatenations, ints, and doubles.
 *
 * @author Domenic Iorfida
 * @version 9/4/20, V6
 */
public class CalculationsV6
{
    public static void main()
    {
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;
        
        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2) ); 
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();
        
        // 1.08 Additional int Equations
        int newInum1 = 48;
        int newInum2 = 15;
        System.out.println("Additional int Equations");
        System.out.println("(" + newInum1 + " + " + newInum2 + ")" + " / " + newInum2 + " = " + ((newInum1 + newInum2) / newInum2));
        System.out.println(newInum1 + " % " + newInum2 + " = " + newInum1 % newInum2);
        System.out.println(newInum2 + " * " + newInum2 + " = " + newInum1 * newInum2);
        System.out.println();
        
        // 1.09 Additional double Equations
        double newDNum1 = 4.5;
        double newDNum2 = 23.9;
        System.out.println("Additional double Equations");
        System.out.println(newDNum1 + " * " + newDNum2 + " = " + newDNum1 * newDNum2);
        System.out.println(newDNum2 + " % " + newDNum1 + " = " + newDNum2 % newDNum1);
        System.out.println(newDNum2 + " / " + newDNum1 + " = " + newDNum2 / newDNum1);
               
    } // end of main method
}
