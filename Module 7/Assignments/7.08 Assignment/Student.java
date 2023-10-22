
/**
 * Student Object.
 *
 * @author Domenic Iorfida
 * @version 2/7/21
 */
public class Student
{
    private String name;
    private int quiz1;
    private int quiz2;
    private int quiz3;
    private int quiz4;
    private int quiz5;
    
    public Student(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5)
    {
        this.name = name;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
        this.quiz4 = quiz4;
        this.quiz5 = quiz5;
    }
    
    public int getQuiz(int number)
    {
        if(number == 1)
            return quiz1;
        else if(number == 2)
            return quiz2;
        else if(number == 3)
            return quiz3;
        else if(number == 4)
            return quiz4;
        else
            return quiz5;
    }
    
    public void setQuiz(int number, int score)
    {
        if(number == 1)
            quiz1 = score;
        else if(number == 2)
            quiz2 = score;
        else if(number == 3)
            quiz3 = score;
        else if(number == 4)
            quiz4 = score;
        else
            quiz5 = score;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public String toString()
    {
        return String.format("%-15s %5d %5d %5d %5d %5d", name, quiz1, quiz2, quiz3, quiz4, quiz5);
    }
}
