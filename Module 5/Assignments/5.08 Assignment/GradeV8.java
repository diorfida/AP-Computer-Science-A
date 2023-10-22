
/**
 * Object that handles a student and their two grades.
 *
 * @author Domenic Iorfida
 * @version 11/12/20
 */
public class GradeV8
{
    private String myName = "";
    private double myGrade1 = 0;
    private double myGrade2 = 0;
    
    public GradeV8(String name, double grade1, double grade2){
        myName = name;
        myGrade1 = grade1;
        myGrade2 = grade2;
    }
    
    public String getName(){
        return myName;
    }
    
    public void setName(String newName){
        myName = newName;
    }
    
    public int getGrade1(){
        return (int)myGrade1;
    }
    
    public void setGrade1(int newGrade){
        myGrade1 = (double) newGrade;
    }
    
    public void setGrade1(double newGrade){
        myGrade1 = newGrade;
    }
    
    public int getGrade2(){
        return (int)myGrade2;
    }
    
    public void setGrade2(int newGrade){
        myGrade2 = (double) newGrade;
    }
    
    public void setGrade2(double newGrade){
        myGrade2 = newGrade;
    }
    
    public double getAverage(){
        return (myGrade1 + myGrade2) / 2;
    }
}
