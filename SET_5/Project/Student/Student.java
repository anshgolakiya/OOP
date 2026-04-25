package SET_5.Project.Student;

public class Student {
    protected String name ;
    protected int rollNo;
    public Student(String name , int rollNo){
        this.name = name ;
        this.rollNo = rollNo ;
    }
    void displayDetails(){
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}