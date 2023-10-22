
/**
 * Array version of the tester class for the Candidate Object
 *
 * @author Domenic Iorfida
 * @version 2/7/21
 */
public class ElectionTesterV3
{
    public static void printCandidates(Candidate[] candidates)
    {
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
        System.out.printf("%-15s %-15s %-15s\n", "", " Votes", "% of Total");
        System.out.printf("%-15s %-15s %-15s\n", "Candidate", "Recieved", "   Votes");
        
        for(Candidate temp : candidates){
            System.out.printf("%-17s %-16d %-17.2f\n", temp.getName(), temp.getVotes(), (double)temp.getVotes()/total * 100);
        }
        System.out.println("\nThe total number of votes is: " + total);
    }
    
    public static void changeName(Candidate[] candidates, String oldName, String newName)
    {
        for(Candidate temp : candidates){
            if(temp.getName().equals(oldName)){
                temp.setName(newName);
            }
        }
    }
    
    public static void changeVotes(Candidate[] candidates, String nameFind, int newVotes)
    {
        for(Candidate temp : candidates){
            if(temp.getName().equals(nameFind)){
                temp.setVotes(newVotes);
            }
        }
    }
    
    public static void changeAll(Candidate[] candidates, String nameFind, String newName, int newVotes)
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
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Kemba", 55);
        candidates[1] = new Candidate("Jayson", 99);
        candidates[2] = new Candidate("Marcus", 63);
        candidates[3] = new Candidate("Theis", 22);
        candidates[4] = new Candidate("Jalen", 96);
        
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