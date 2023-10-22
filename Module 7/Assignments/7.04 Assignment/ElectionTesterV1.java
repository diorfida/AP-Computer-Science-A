
/**
 * Array version of the tester class for the Candidate Object
 *
 * @author Domenic Iorfida
 * @version 2/7/21
 */
public class ElectionTesterV1
{
    public static void printCandidates(Candidate[] candidates)
    {
        System.out.println(" Raw Election Data: \n");
        for(Candidate temp : candidates){
            System.out.println(temp);
        }
    }
    
    public static int totalVotesCast(Candidate[] candidates)
    {
        int total = 0;
        for(Candidate temp : candidates){
            total += temp.getVotes();
        }
        return total;
    }
    
    public static void printElectionTable(Candidate[] candidates, int total)
    {
        System.out.println("Election Results: \n");
        System.out.printf("%-15s %-15s %-15s\n", "", " Votes", "% of Total");
        System.out.printf("%-15s %-15s %-15s\n", "Candidate", "Recieved", "   Votes");
        
        for(Candidate temp : candidates){
            System.out.printf("%-17s %-16d %-17.2f\n", temp.getName(), temp.getVotes(), (double)temp.getVotes()/total * 100);
        }
    }
    
    public static void main(String[] args)
    {
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Kemba", 55);
        candidates[1] = new Candidate("Jayson", 99);
        candidates[2] = new Candidate("Marcus", 63);
        candidates[3] = new Candidate("Theis", 22);
        candidates[4] = new Candidate("Jalen", 96);
        
        printCandidates(candidates);
        System.out.println("\n");
        int totalVotes = totalVotesCast(candidates);
        printElectionTable(candidates, totalVotes);
        System.out.println("\nThe total number of votes is: " + totalVotes);
    }
}
