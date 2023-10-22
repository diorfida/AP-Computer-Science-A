
/**
 * Tester class for the contact object.
 *
 * @author Domenic Iorfida
 * @version 2/15/21
 */
public class ContactListTester
{
    public static void main(String[] args)
    {
        Contact[] contacts = new Contact[10];
        contacts[0] = new Contact("Stephen Curry", "PG", "Mar 14", "123-456-7890", "stephcurry30@gsw.org");
        contacts[1] = new Contact("Klay Thompson", "SG", "Feb 8", "343-154-2254", "thompsonk@gsw.org");
        contacts[2] = new Contact("Gordon Hayward", "SF", "Mar 23", "258,158,6888", "hayward@clthornets.net");
        contacts[3] = new Contact("Draymond Green", "PF", "Mar 4", "684-687-5785", "money23green@gsw.edu");
        contacts[4] = new Contact("Marquese Chriss", "C", "Jul 2", "651-842-2222", "chriss@goldenstate.org");
        contacts[5] = new Contact("Ky Bowman", "PG", "Jun 16", "325-542-9852", "bowman@warriors.net");
        contacts[6] = new Contact("Damion Lee", "SG", "Oct 21", "666-777-8899", "leecurry@gsw.com");
        contacts[7] = new Contact("Eric Paschall", "PF", "Nov 4", "515-425-5842", "paschall@warriorsground.com");
        contacts[8] = new Contact("Kevon Looney", "C", "Feb 6", "546-888-6336", "looney@gsw.edu");
        contacts[9] = new Contact("Robert Williams", "C", "Oct 17", "989-999-9955", "rwill@bostoncs.com");
        
        System.out.println("Original Contacts Array:");
        printTable(contacts);
        
        System.out.println("\n<< Searching for the name Damion Lee >>");
        searchForName(contacts, "Damion Lee");
        
        System.out.println("\n<< Searching for the name Lebron James >>");
        searchForName(contacts, "Lebron James");
        
        System.out.println("\n<< Searching for relation C >>");
        searchForRelation(contacts, "C");
        
        System.out.println("\n<< Searching for relation Guard >>");
        searchForRelation(contacts, "Gurad");
        
        System.out.println("\n<< Searching for the birth month February (Feb) >>");
        searchForBirthMonth(contacts, "Feb");
        
        System.out.println("\n<< Searching for the birth month December (Dec) >>");
        searchForBirthMonth(contacts, "Dec");
        
        System.out.println("\n<< Searching for phone number 123-456-7890");
        searchForPhoneNumber(contacts, "123-456-7890");
        
        System.out.println("\n<< Searching for phone number 546-154-6666");
        searchForPhoneNumber(contacts, "546-154-6666");
        
        System.out.println("\n<< Searching for email money23green@gsw.edu >>");
        searchForEmail(contacts, "money23green@gsw.edu");
        
        System.out.println("\n<< Searching for email kingjames@gmail.com >>");
        searchForEmail(contacts, "kingjames@gmail.com");
    }
    
    private static void printTable(Contact[] contacts)
    {
        for(Contact temp : contacts){
            System.out.println(temp);
        }
    }
    
    private static void sortByName(Contact[] source)
    {
        int i;
        int k;
        int posMax;
        Contact temp;
        for (i = source.length - 1 ; i >= 0 ; i--){
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if ( source[k].getName().compareTo(source[posMax].getName()) > 0)
                    posMax = k;
            }
            temp = source[i];
            source[i] = source[posMax];
            source[posMax] = temp;
        }
    }
    
    private static void sortByRelation(Contact[] source)
    {
        int i;
        int k;
        int posMax;
        Contact temp;
        for (i = source.length - 1 ; i >= 0 ; i--){
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ ){
                if ( source[k].getRelation().compareTo(source[posMax].getRelation()) > 0)
                    posMax = k;
            }
            temp = source[i];
            source[i] = source[posMax];
            source[posMax] = temp;
        }
    }
    
    private static void searchForName(Contact[] source, String target)
    {
        sortByName(source);
        int high = source.length;
        int low = -1;
        int probe;

        while(high - low > 1)
        {
            probe = (high + low) / 2;
            if(source[probe].getName().compareTo(target) > 0)
                high = probe;
            else
                low = probe;
        }
        
        if((low >= 0) && (source[low].getName().compareTo(target) == 0 ))
            System.out.println(source[low]);
        else
            System.out.println("NOT FOUND: " + target);
    }
    
    private static void searchForRelation(Contact[] source, String target)
    {
        sortByRelation(source);
        int high = source.length;
        int low = -1;
        int probe;

        while(high - low > 1)
        {
            probe = (high + low) / 2;

            if(source[probe].getRelation().compareTo(target) > 0)
                high = probe;
            else
            {
                low = probe;
                if(source[probe].getRelation().compareTo(target) == 0)
                {
                    break;
                }
            }
        }
        
        if( (low >= 0) && (source[low].getRelation().compareTo(target) == 0 ))
        {
            linearPrint(source, low, target);
        }
        else
            System.out.println("NOT found: " + target);
    }
    
    private static void linearPrint(Contact[] source, int low, String target)
    {
        int i;
        int start = low;
        int end = low;

        i = low - 1;
        while((i >= 0) && (source[i].getRelation().compareTo(target) == 0))
        {
            start = i;
            i--;
        }

        i = low + 1;
        while((i < source.length) && (source[i].getRelation().compareTo(target) == 0))
        {
            end = i;
            i++;
        }
        
        for(i = start; i <= end; i++)
            System.out.println(source[i]);
    }
    
    private static void searchForBirthMonth(Contact[] source, String target)
    {
        int found = 0;
        
        for(Contact contact : source)
        {
            if(contact.getBirthday().substring(0, 3).compareTo(target) == 0)
            {
                System.out.println(contact);
                found++;
            }
        }
        
        if(found == 0)
        {
            System.out.println("NOT found: " + target);
        }
    }
    
    private static void searchForPhoneNumber(Contact[] source, String target)
    {
        int found = 0;
        
        for(Contact contact : source)
        {
            if(contact.getPhoneNumber().compareTo(target) == 0)
            {
                System.out.println(contact);
                found++;
            }
        }
        
        if(found == 0)
        {
            System.out.println("NOT found: " + target);
        }
    }
    
    private static void searchForEmail(Contact[] source, String target)
    {
        int found = 0;
        
        for(Contact contact : source)
        {
            if(contact.getEmail().compareTo(target) == 0)
            {
                System.out.println(contact);
                found++;
            }
        }
        
        if(found == 0)
        {
            System.out.println("NOT found: " + target);
        }
    }
}
