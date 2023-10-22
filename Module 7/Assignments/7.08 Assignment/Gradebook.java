
/**
 * Tester class for the Student object.
 *
 * @author Domenic Iorfida
 * @version 2/7/21
 */
import java.util.ArrayList;
public class Gradebook
{
    public static void printTable(ArrayList<Student> students)
    {
        System.out.printf("%-15s %5s %5s %5s %5s %5s\n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("-----------------------------------------------");
        for(Student student : students){
            System.out.println(student);
        }
    }
    
    public static void replaceStudentName(ArrayList<Student> students, String oldName, String newName)
    {
        for(Student student : students){
            if(student.getName().equals(oldName))
                student.setName(newName);
        }
    }
    
    public static void replaceStudentGrade(ArrayList<Student> students, String findName, int gradeNum, int newGrade)
    {
        for(Student student : students){
            if(student.getName().equals(findName))
                student.setQuiz(gradeNum, newGrade);
        }
    }
    
    public static void replaceStudent(ArrayList<Student> students, String findName, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        for(Student student : students){
            if(student.getName().equals(findName)){
                student.setName(newName);
                student.setQuiz(1, q1);
                student.setQuiz(2, q2);
                student.setQuiz(3, q3);
                student.setQuiz(4, q4);
                student.setQuiz(5, q5);
            }
        }
    }
    
    public static void addStudentBefore(ArrayList<Student> students, String findName, String newName, int q1, int q2, int q3, int q4, int q5)
    {
        int index = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(findName))
                index = i;
        }
        
        students.add(index, new Student(newName, q1, q2, q3, q4, q5));
    }
    
    public static void deleteStudent(ArrayList<Student> students, String delete)
    {
        int index = 0;
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getName().equals(delete))
                index = i;
        }
        
        students.remove(index);
    }
    
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Curry", 89, 96, 25, 78, 99));
        students.add(new Student("Thompson", 56, 98, 82, 73, 85));
        students.add(new Student("Wiggins", 65, 32, 75, 82, 13));
        students.add(new Student("Draymond", 45, 21, 78, 96, 89));
        students.add(new Student("Chriss", 12, 85, 45, 56, 76));
        
        System.out.println("Starting Gradebook: \n");
        printTable(students);
        
        System.out.println("\n<< Renaming Wiggins to Paschall >>\n");
        replaceStudentName(students, "Wiggins", "Paschall");
        printTable(students);
        
        System.out.println("\n<< Replacing Thompson Grade 1 with 93 >>\n");
        replaceStudentGrade(students, "Thompson", 1, 93);
        printTable(students);
        
        System.out.println("\n<< Replacing Chriss with new student Bowman >>\n");
        replaceStudent(students, "Chriss", "Bowman", 58, 25, 34, 78, 96);
        printTable(students);
        
        System.out.println("\n<< Adding new student Looney before Draymond >>\n");
        addStudentBefore(students, "Draymond", "Looney", 68, 45, 58, 83, 99);
        printTable(students);
        
        System.out.println("\n<< Delete Draymond >>\n");
        deleteStudent(students, "Draymond");
        printTable(students);
    }
}
