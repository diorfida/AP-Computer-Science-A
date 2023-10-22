
/**
 * Runs a program implementing the CheeseCakeV2 object.
 *
 * @author Domenic Iorfida
 * @version 2/4/21
 */
import java.util.ArrayList;
public class CheeseCakeTester
{
    public static void main(String[] args)
    {
        ArrayList<CheeseCakeV2> cake = new ArrayList<CheeseCakeV2>();
        cake.add(new CheeseCakeV2("Blueberry", 4));
        cake.add(new CheeseCakeV2("Strawberry", 6));
        cake.add(new CheeseCakeV2("Basic", 1));
        cake.add(new CheeseCakeV2("Turtle", 3));
        cake.add(new CheeseCakeV2("Chocolate", 5));
        cake.add(new CheeseCakeV2("Raspberry", 20));
        
        for(CheeseCakeV2 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcSugar();
            dataRecord.calcVanilla();
        }
        
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");
        
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.println(cake.get(index).toString(index));
        }
    }
}
