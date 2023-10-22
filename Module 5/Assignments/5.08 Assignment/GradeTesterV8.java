
/**
 * Uses the GradeV8 class.
 *
 * @author Domenic Iorfida
 * @version 11/12/20
 */
public class GradeTesterV8
{
    public static void main(String[] args){
        GradeV8 student1 = new GradeV8("John", 85, 90);
        GradeV8 student2 = new GradeV8("Alisa", 90, 92);
        GradeV8 student3 = new GradeV8("Jessica", 92, 84);
        
        System.out.print(" Student");
        System.out.print("\t Grade 1");
        System.out.print("\t Grade 2 ");
        System.out.println("\t Average");
        System.out.println("========================================================");
        
        System.out.print(" "  + student1.getName());
        System.out.print("\t\t " + student1.getGrade1());
        System.out.print("\t\t " + student1.getGrade2());
        System.out.println("\t\t " + student1.getAverage());
        
        System.out.print(" "  + student2.getName());
        System.out.print("\t\t " + student2.getGrade1());
        System.out.print("\t\t " + student2.getGrade2());
        System.out.println("\t\t " + student2.getAverage());
        
        System.out.print(" "  + student3.getName());
        System.out.print("\t " + student3.getGrade1());
        System.out.print("\t\t " + student3.getGrade2());
        System.out.println("\t\t " + student3.getAverage());
    }
}
