import java.util.*;
class Employee{
    String name ;
    String department ;

    Employee(String name , String department){
        this.name = name;
        this.department = department ;
    }
    void displayDetails(){
        System.out.println("Employee Name : " + name);
        System.out.println("Department : " + department);
    }
}
class Manager extends Employee {
    int teamSize ;
    String ProjectName ;
    Manager(String name , String department , int teamSize , String ProjectName){
        super(name,department);
        this.teamSize = teamSize ;
        this.ProjectName = ProjectName ;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
        System.out.println("Project : " + ProjectName);
    }
}
public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        String empName = sc.nextLine();
        System.out.println("Enter Department : ");
        String empDept = sc.nextLine();

        Employee emp = new Employee(empName,empDept);

        System.out.println("Enter Manager name : ");
        String mgrName = sc.nextLine();
        System.out.println("Enter Department : ");
        String mgrDept = sc.nextLine();
        System.out.println("Enter Team size : ");
        int teamSize = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter Project Name : ");
        String project = sc.nextLine();

        Manager mgr = new Manager(mgrName, mgrDept, teamSize, project);

        Employee emp2 = new Manager("Priya","Software" , 8 ,"AI System");

        System.out.println("===== Employee Details ======");
        emp.displayDetails();
        System.out.println("===== Manager Details =======");
        mgr.displayDetails();
        System.out.println("===== Runtime Polymorphism =====");
        emp2.displayDetails();
    }
}
