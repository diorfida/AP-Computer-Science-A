/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Domenic Iorfida
 * @version 9/10/20
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;     // starting US Dollars

        // Pesos for Chile
        double pesosSpent = 70210.25;            // Pesos spent in Chile
        double pesoExchangeRate = 718.39;     // 1 US dollar = 718.39 Pesos
        double dollarsSpentInChile = 0.0;      // US dollars spent in Mexico
        double dollarsAfterChile = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
        // Taiwan Dollars for Taiwan
        double taiwanDollarsSpent = 10260.0;
        double taiwanDollarExchangeRate = 27.46;
        double dollarsSpentInTaiwan = 0.0;
        double dollarsAfterTaiwan = 0.0;
        
        // Euros for the Azores
        double eurosSpent = 1079.0;
        double euroExchangeRate = 0.80;
        double dollarsSpentInAzores = 0.0;
        double dollarsAfterAzores = 0.0;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        System.out.println("Starting US Dollars:     " + startingUsDollars);
        
        System.out.println();
        
        // Conversion
        // code goes below here
        System.out.println("Chile:");
        System.out.println("    Pesos Spent:    " + pesosSpent);
        dollarsSpentInChile = pesosSpent / pesoExchangeRate;
        System.out.println("    US Dollars Equivalent:   " + dollarsSpentInChile);
        dollarsAfterChile = startingUsDollars - dollarsSpentInChile;
        System.out.println("    US Dollars Remaining:   " + dollarsAfterChile);
        System.out.println();

        System.out.println("Taiwan:");
        System.out.println("    Taiwan Dollars Spent:    " + taiwanDollarsSpent);
        dollarsSpentInTaiwan = taiwanDollarsSpent / taiwanDollarExchangeRate;
        System.out.println("    US Dollars Equivalent:   " + dollarsSpentInTaiwan);
        dollarsAfterTaiwan = dollarsAfterChile - dollarsSpentInTaiwan;
        System.out.println("    US Dollars Remaining:   " + dollarsAfterTaiwan);
        System.out.println();
        
        System.out.println("Azores:");
        System.out.println("    Euros Spent:    " + eurosSpent);
        dollarsSpentInAzores = eurosSpent / euroExchangeRate;
        System.out.println("    US Dollars Equivalent:   " + dollarsSpentInAzores);
        dollarsAfterAzores = dollarsAfterTaiwan - dollarsSpentInAzores;
        System.out.println("    US Dollars Remaining:   " + dollarsAfterAzores);
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = budget1 / costItem1;        //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;      //budget for second item
        System.out.println((int) costItem2);
        int totalItems2 = budget2 / (int) costItem2 - 1;    //how many items can be purchased
        double fundsRemaining2 = (double) budget2 % costItem2;   //how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

