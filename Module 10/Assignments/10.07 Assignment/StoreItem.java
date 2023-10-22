
/**
 * Store Item object class.
 *
 * @author Domenic Iorfida
 * @version 3/29/21
 */
public class StoreItem
{
    private String name;
    private int productNumber;
    private double price;
    private int quantity;
    
    public StoreItem(String n, int prodNum, double pr, int q)
    {
        name = n;
        productNumber = prodNum;
        price = pr;
        quantity = q;
    }
    
    public String getName(){return name;}
    public int getProductNumber(){return productNumber;}
    public double getPrice(){return price;}
    public int getQuantity(){return quantity;}
    
    public void setName(String n){name = n;}
    public void setProductNumber(int pn){productNumber = pn;}
    public void setPrice(double p){price = p;}
    public void setQuantity(int q){quantity = q;}
    
    private String formatPrice(){
        return String.format("$%-9.2f", price);
    }
    
    public String toString(){
        return String.format("%-25s %-10d %-10s %-5d", name, productNumber, formatPrice(), quantity);
    }
}
