
/**
 * Class for cheesecake objects.
 *
 * @author Domenic Iorfida
 * @version 2/4/21
 */
public class CheeseCakeV2
{
    private String flavor;
    private int quantity;
    private int servings;
    private int creamCheese;
    private double sugar;
    private int vanilla;
    
    public CheeseCakeV2(String flavor, int quantity)
    {
        this.flavor = flavor;
        this.quantity = quantity;
        
        servings = 0;
        creamCheese = 32;
        sugar = 1.0/3;
        vanilla = 1;
    }
    
    public void calcTotalServings()
    {
        servings = 16 * quantity;
    }
    
    public void calcCreamCheese()
    {
        creamCheese = 32 * quantity;
    }
    
    public void calcSugar()
    {
        sugar = (1.0/3) * quantity;
    }
    
    public void calcVanilla()
    {
        vanilla = 1 * quantity;
    }
    
    public String getFlavor()
    {
        return flavor;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public int getServings()
    {
        return servings;
    }
    
    public int getCreamCheese()
    {
        return creamCheese;
    }
    
    public double getSugar()
    {
        return sugar;
    }
    
    public int getVanilla()
    {
        return vanilla;
    }
    
    public String toString(int index)
    {
        return String.format("|%-7d|%-10d|%-15s|%-11d oz|%-10d|%-6.2f cups|%-6d tsps|", index, quantity, flavor, creamCheese, servings, sugar, vanilla);
    }
}
