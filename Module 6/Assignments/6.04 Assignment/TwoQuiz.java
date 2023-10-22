
/**
 * Class that uses quiz grades to calculate various information.
 *
 * @author Domenic Iorfida
 * @version 1/20/21
 */
public class TwoQuiz
{
    private String name;
    private int grade1;
    private int grade2;
    private double difference;
    private double average;
    
    public TwoQuiz(String myName, int myGrade1, int myGrade2){
        name = myName;
        grade1 = myGrade1;
        grade2 = myGrade2;
        calcDifference();
        calcAverage();
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String myName){
        name = myName;
    }
    
    public int getGrade1(){
        return grade1;
    }
    
    public void setGrade1(int myGrade1){
        grade1 = myGrade1;
    }
    
    public int getGrade2(){
        return grade2;
    }
    
    public void setGrade2(int myGrade2){
        grade2 = myGrade2;
    }
    
    
    public double getDifference(){
        return difference;
    }
    
    public double getAverage(){
        return average;
    }
    
    public void calcDifference(){
        difference = (double) grade2 - (double)grade1;
    }
    
    public void calcAverage(){
        int temp = grade1 + grade2;
        average = (double) temp/2.0;
    }
    
    public String toString(){
        return String.format("%-20s %-20d %-20d %-20.2f %-20.2f", getName(), getGrade1(), getGrade2(), getDifference(), getAverage());
    }
}
