import java.util.*;
class Employee{
    private String employeeName ;
    private double employeeSalary ;
    
    void readEmpData(String Ename ,double Esalary){
        employeeName = Ename ;
        employeeSalary = Esalary ;
    }

    void displayEmpData(){
        System.out.println("Employee name :   " + employeeName);
        System.out.println("Employee Salary : " + employeeSalary);
    }
}
public class employreaddisp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee(); 
        System.out.print("Enter employee name : ");
        String name = sc.next() ;
        System.out.print("Enter a employee salary : ");
        double salary = sc.nextDouble();
        emp.readEmpData(name, salary);
        emp.displayEmpData();
        sc.close() ;
    }
}
