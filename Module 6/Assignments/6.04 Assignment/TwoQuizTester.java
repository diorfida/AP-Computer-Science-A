
/**
 * Tester for the TwoQuiz class
 *
 * @author Domenic Iorfida
 * @version 1/20/21
 */
public class TwoQuizTester
{
    public static void main(String[] args){
        TwoQuiz[] quizResults = {
            new TwoQuiz("Aaron", 92, 88),
            new TwoQuiz("Blake", 78, 85),
            new TwoQuiz("Jacki", 93, 80),
            new TwoQuiz("Denise", 92, 95)
        };
        
        System.out.printf("%50s %50s\n", "Quiz Results", "");
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", "Student Name", "Quiz 1 Grade", "Quiz 2 Grade", "Difference", "Average");
        System.out.println("============================================================================================");
        
        for(TwoQuiz result : quizResults){
            System.out.println(result.toString());
        }
    }
}
