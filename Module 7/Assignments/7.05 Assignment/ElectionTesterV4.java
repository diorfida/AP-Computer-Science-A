
/**
 * ArrayList version of the tester class for the Candidate Object
 *
 * @author Domenic Iorfida
 * @version 2/7/21
 */
import java.util.ArrayList;
public class ElectionTesterV4
{
    public static void printCandidates(ArrayList<Candidate> candidates)
    {
        System.out.println(" Raw Election Data: \n");
        for(Candidate temp : candidates){
            System.out.println(temp);
        }
    }
    
    public static int totalVotesCast(ArrayList<Candidate> candidates)
    {
        int total = 0;
        for(Candidate temp : candidates){
            total += temp.getVotes();
        }
        return total;
    }
    
    public static void printElectionTable(ArrayList<Candidate> candidates, int total)
    {
        System.out.printf("%-15s %-15s %-15s\n", "", " Votes", "% of Total");
        System.out.printf("%-15s %-15s %-15s\n", "Candidate", "Recieved", "   Votes");
        
        for(Candidate temp : candidates){
            System.out.printf("%-17s %-16d %-17.2f\n", temp.getName(), temp.getVotes(), (double)temp.getVotes()/total * 100);
        }
        System.out.println("\nThe total number of votes is: " + total);
    }
    
    public static void changeName(ArrayList<Candidate> candidates, String oldName, String newName)
    {
        for(Candidate temp : candidates){
            if(temp.getName().equals(oldName)){
                temp.setName(newName);
            }
        }
    }
    
    public static void changeVotes(ArrayList<Candidate> candidates, String nameFind, int newVotes)
    {
        for(Candidate temp : candidates){
            if(temp.getName().equals(nameFind)){
                temp.setVotes(newVotes);
            }
        }
    }
    
    public static void changeAll(ArrayList<Candidate> candidates, String nameFind, String newName, int newVotes)
    {
        for(Candidate temp : candidates){
            if(temp.getName().equals(nameFind)){
                temp.setName(newName);
                temp.setVotes(newVotes);
            }
        }
    }
    
    public static void main(String[] args)
    {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Kemba", 55));
        candidates.add(new Candidate("Jayson", 99));
        candidates.add(new Candidate("Marcus", 63));
        candidates.add(new Candidate("Theis", 22));
        candidates.add(new Candidate("Jalen", 96));
        
        System.out.println("Original Results: \n");
        int totalVotes = totalVotesCast(candidates);
        printElectionTable(candidates, totalVotes);
        
        System.out.println("<< Changing Theis to Semi >>\n");
        changeName(candidates, "Theis", "Semi");
        printElectionTable(candidates, totalVotes);
        
        System.out.println("<< Changing Marcus votes to 78 >>\n");
        changeVotes(candidates, "Marcus", 78);
        totalVotes = totalVotesCast(candidates);
        printElectionTable(candidates, totalVotes);
        
        System.out.println("<< Changing Kemba to Robert and votes to 41 >>\n");
        changeAll(candidates, "Kemba", "Robert", 41);
        totalVotes = totalVotesCast(candidates);
        printElectionTable(candidates, totalVotes);
    }
}
