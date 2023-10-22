
/**
 * Store Tester class.
 *
 * @author Domenic Iorfida
 * @version 3/29/21
 */
public class StoreTester
{
    public static void main(String[] args)
    {
        StoreItem[] items = new StoreItem[10];
        items[0] = new StoreItem("Butter2Go", 2649, 1.99, 56);
        items[1] = new StoreItem("Fresh Fruit", 3145, 5.99, 12);
        items[2] = new StoreItem("Disposable Masks", 8654, 11.99, 25);
        items[3] = new StoreItem("Graphics T-Shirt", 2148, 22.50, 33);
        items[4] = new StoreItem("Office Chair", 7542, 103.99, 4);
        items[5] = new StoreItem("Milk", 1001, 2.99, 66);
        items[6] = new StoreItem("Hamburgers", 2034, 6.99, 16);
        items[7] = new StoreItem("Whiteboard", 9963, 63.77, 5);
        items[8] = new StoreItem("Basic Plant", 4752, 25.00, 11);
        items[9] = new StoreItem("Textbook", 5364, 49.99, 27);
        
        System.out.println("Items in the store:\n");
        printArrayElements(items);
        
        System.out.println("\n<< Sorting by Product Number >>\n");
        StoreItem[] sortProdNum = sortByProductNum(items, false);
        printArrayElements(sortProdNum);
        
        System.out.println("\n<< Sorting by Product Number Reverse Order >>\n");
        sortProdNum = sortByProductNum(items, true);
        printArrayElements(sortProdNum);
        
        System.out.println("\n<< Sorting by Product Name >>\n");
        sortByName(items, false);
        printArrayElements(items);
        
        System.out.println("\n<< Sorting by Product Name Reverse Order >>\n");
        sortByName(items, true);
        printArrayElements(items);
        
        System.out.println("\n<< Sorting by Price >>\n");
        sortByPrice(items, 0, items.length - 1);
        printArrayElements(items);
        
        System.out.println("\n<< Sorting by Quantity >>\n");
        sortByQuantity(items, 0, items.length - 1);
        printArrayElements(items);
    }
    
    public static void printArrayElements(StoreItem[] array)
    {
        for(StoreItem i : array)
            System.out.println(i);
    }
    
    public static StoreItem[] sortByProductNum(StoreItem[] source, boolean reversed)
    {
        StoreItem[] dest = new StoreItem[source.length];

        for(int i = 0 ; i < source.length ; i++)
        {
            StoreItem next = source[ i ];
            int insertIndex = 0;
            int k = i;
            while(k > 0 && insertIndex == 0)
            {
                if(!reversed){
                    if(next.getProductNumber() > dest[k-1].getProductNumber())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }else {
                    if(next.getProductNumber() > dest[k-1].getProductNumber())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
            }

            dest[ insertIndex ] = next;
            
        } 
        return dest;
    }
    
    public static void sortByName(StoreItem[] source, boolean reversed)
    {
        int i;
        int k;
        int posMax;
        StoreItem temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 1 ; k <= i ; k++ )
            {
                if(!reversed){
                    if ( source[k].getName().compareTo(source[posMax].getName()) > 0 ){
                        posMax = k;
                    }
                }else{
                    if ( source[k].getName().compareTo(source[posMax].getName()) < 0 ){
                        posMax = k;
                    }
                }
            }
            temp = source[ i ];
            source[ i ] = source[posMax];
            source[ posMax ] = temp;
        }
    }
    
    public static void sortByPrice(StoreItem[] a, int low, int high)
    {
        if(low == high)
            return;
            
        int mid = (low + high) / 2;
        
        sortByPrice(a, low, mid);
        sortByPrice(a, mid + 1, high);
        
        merge(a, low, mid, high, true);
    }
    
    public static void sortByQuantity(StoreItem[] a, int low, int high)
    {
        if(low == high)
            return;
            
        int mid = (low + high) / 2;
        
        sortByQuantity(a, low, mid);
        sortByQuantity(a, mid + 1, high);
        
        merge(a, low, mid, high, false);
    }
    
    public static void merge(StoreItem[] a, int low, int mid, int high, boolean price)
    {
        StoreItem[] temp = new StoreItem[high - low + 1];
        
        int i = low;
        int j = mid + 1;
        int n = 0;
        
        while(i <= mid || j <= high)
        {
            if(price)
            {
                if(i > mid)
                {   
                    temp[n] = a[j];
                    j++;
                }   
                else if(j > high)
                {
                    temp[n] = a[i];
                    i++;
                }
                else if(a[i].getPrice() < a[j].getPrice())
                {
                    temp[n] = a[i];
                    i++;
                }
                else
                {
                    temp[n] = a[j];
                    j++;
                }
                n++;
            }
            else
            {
                if(i > mid)
                {   
                    temp[n] = a[j];
                    j++;
                }   
                else if(j > high)
                {
                    temp[n] = a[i];
                    i++;
                }
                else if(a[i].getQuantity() < a[j].getQuantity())
                {
                    temp[n] = a[i];
                    i++;
                }
                else
                {
                    temp[n] = a[j];
                    j++;
                }
                n++;
            }
        }
        for(int k = low; k <= high; k++)
            a[k] = temp[k - low];
    }
}
