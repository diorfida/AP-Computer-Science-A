
/**
 * Program that asks the user for information to buy a movie ticket and prints
 * an e-reciept.
 *
 * @author Domenic Iorfida
 * @version 9/24/20
 */
import java.util.Scanner;
public class BuyMovieTickets
{
    public static void main(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Good Evening.");
        
        System.out.print("Please enter your first and last name: ");
        String firstName = in.next();
        String lastName = in.next();
        
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String dateInput = in.next();
        int month = Integer.parseInt(dateInput.substring(0, 1));
        int day = Integer.parseInt(dateInput.substring(3, 4));
        int year = Integer.parseInt(dateInput.substring(6, 9));
        
        System.out.print("What movie would you like to see? ");
        String movieTitleWord1 = in.next();
        String movieTitleRest = in.nextLine();
        String movieTitle = movieTitleWord1 + movieTitleRest;
        
        System.out.print("How many tickets? ");
        String ticketsInput = in.next();
        int numTickets = Integer.parseInt(ticketsInput);
        
        System.out.print("What is the ticket price? $");
        String priceInput = in.next();
        double ticketPrice = Double.parseDouble(priceInput);
        
        System.out.print("Enter your debit card number (#####-###-####) ");
        String debitInput = in.next();
        int mid3debit = Integer.parseInt(debitInput.substring(6, 9));
        int last4debit = Integer.parseInt(debitInput.substring(10, 14));
        
        System.out.print("Enter your PIN (#####) : ");
        String pin = in.next();
        System.out.println();
        
        System.out.println("----------------------------------------------------");
        
        System.out.println("Your e-Recipt\n");
        
        System.out.println(month + "-" + day + "-" + year);
        
        System.out.println("Order Number: ra" + mid3debit + "\n");
        
        System.out.println("    " + firstName.substring(0, 1) + ". " + lastName);
        System.out.println("    " + "Account: #####-###-" + last4debit);
        System.out.println("    " + "Movie: " + movieTitle);
        System.out.println("    " + "Number of Tickets: " + numTickets);
        System.out.println("    " + "Ticket Price: " + ticketPrice + "\n");
        
        System.out.println("    $" + (ticketPrice * numTickets) + " will be debited to your account" + "\n");
        
        System.out.println("Thank you. Enjoy your movie tonight.");
        System.out.println("----------------------------------------------------");
    }
}
