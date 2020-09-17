import java.util.ArrayList;
import java.util.Iterator;

public class GradeCalculator{
    /* private member variables.  Do not change these*/

    private ArrayList<Double> assignmentGrades = new ArrayList<>();
    private double finalExam;
    private ArrayList<Double> ceGrades = new ArrayList<>();
    private double labTotal;
    private double selfStudyAverage;

//you can use these methods or write your own

    private void setAssignmentGrades(double a1, double a2, double a3){
        /* this is an example of how to add things to an array list
        but it is not a complete method.  You will need to finish it*/

        assignmentGrades.add(a1);
        assignmentGrades.add(a2);
        assignmentGrades.add(a3);
        
    }


    private  void setCeGrades(double s1, double s2, double s3){
        /*this is similar to the setAssignmentGrades method*/
        ceGrades.add(s1);
        ceGrades.add(s2);
        ceGrades.add(s3);
        


        }


    private void  setFinalExamGrade(double grade){

        finalExam = grade;
    }

     private  void setLabTotal(double grade){
    labTotal = grade;
    

    }

    private  void setSelfStudyAverage(double grade){
      selfStudyAverage = grade;

    }

    private double getHomeworkGrade(){
        /* 
        this method returns the calculated score for assignments and competence interviews
        possibly useful is the ArrayList get(index) method.  
        somearraylist.get(1) will return the element in the second position
        because ArrayLists are zero indexed */
        

    return ((assignmentGrades.get(0)*0.15*ceGrades.get(0))+(assignmentGrades.get(1)*0.15*ceGrades.get(1))+(assignmentGrades.get(2)*0.20*ceGrades.get(2)));
    }
    
    private double getLabGrade(){
        /* returns the lab grade combined with the independent studies grade*/
    return selfStudyAverage* labTotal;
        
        
    }

    public double getFinalCourseGrade(){
        
        return getLabGrade() + getHomeworkGrade() + finalExam;

    }

    public void parseInput(String inputLine){
        /*part of this method is done for you, but not all of it. 
        You will need to finish it*/
    String singles[] = inputLine.split(",");
    setLabTotal(Double.parseDouble(singles[0]));
  
    //more code needed here calling the setter methods
   setAssignmentGrades(Double.parseDouble(singles[1]), Double.parseDouble(singles[2]), Double.parseDouble(singles[3]));
   setCeGrades(Double.parseDouble(singles[4]), Double.parseDouble(singles[5]), Double.parseDouble(singles[6]));
   setSelfStudyAverage(Double.parseDouble(singles[7]));
   setFinalExamGrade(Double.parseDouble(singles[8]));
   if(labTotal>20 || labTotal<0.0){
       System.out.println("Invalid grade Input");
       return;
   }
   if(assignmentGrades.get(0)>100.0 || assignmentGrades.get(0)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(assignmentGrades.get(1)>100.0 || assignmentGrades.get(1)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(assignmentGrades.get(2)>100.0 || assignmentGrades.get(2)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(ceGrades.get(0)>1.0 || ceGrades.get(0)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(ceGrades.get(1)>1.0 || ceGrades.get(1)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(ceGrades.get(2)>1.0 || ceGrades.get(2)<0.0){
      System.out.println("invalid grade input");
      return;
   }
   if(selfStudyAverage>1.0 || selfStudyAverage<0.0){
      System.out.println("invalid grade input");
      return;
   }
    if(finalExam>30.0 || finalExam<0.0){
      System.out.println("invalid grade input");
      return;
   }
   
}
}


