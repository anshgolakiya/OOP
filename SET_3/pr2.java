import java.util.*;
class College{
    String collegeName ;
    College(String collegeName){
        this.collegeName =collegeName ;
    }
    class Admission{
        String studentName ;
        String course ;
        void acceptDetails(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enetr a Student Name : ");
            studentName = sc.nextLine();
            System.err.println("Enter Course Name : ");
            course = sc.nextLine();
            sc.close();
        }
        void display(){
            System.err.println("------Admission Details-------");
            System.out.println("College Name : "+ collegeName);
            System.out.println("Student Name : "+ studentName);
            System.out.println("Course Name  : " + course);
        }
    }
}
public class pr2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter College Name : ");
        String cname = sc.nextLine();
        College c =new College(cname);

        College.Admission ad = c.new Admission() ;
        ad.acceptDetails();
        ad.display();
        sc.close();
    }
}
