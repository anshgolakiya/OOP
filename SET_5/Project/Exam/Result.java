package SET_5.Project.Exam;
import SET_5.project.Student.Student;
public class Result extends Student {
    int mark1 , mark2 , mark3 ;
    public Result(int rollNo , String name , int m1 , int m2  , int m3){
        super(rollNo,name);
        this.mark1 = m1 ;
        this.mark2 = m2 ;
        this.mark3 = m3 ;
    }
    public void displayResult(){
        displayResult();

        int total = mark1 + mark2 + mark3 ;
        double average = total / 3.0 ;

        System.out.println("Mark1 : " + mark1);
        System.out.println("Mark2 : " + mark2);
        System.out.println("Mark3 : " + mark3);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }
    
}
