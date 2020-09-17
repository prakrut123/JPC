import java.util.Scanner;

public class GradeTester{
    
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        GradeCalculator gc = new GradeCalculator();
        String inputLine = null;
//System.out.println("Enter the grades:");
inputLine = in.nextLine();
gc.parseInput(inputLine);
System.out.println("Final Grade is :"+(gc.getFinalCourseGrade()));
        
        
    }
    
    
    
    
}