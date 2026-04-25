package SET_5.Project.Exam;
import java.util.* ;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No : ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name : ");
        String name = sc.nextLine() ;
        System.out.println("Enter Mark1 : ");
        int m1 = sc.nextInt();
        System.out.println("Enter Mark2 : ");
        int m2 = sc.nextInt();
        System.out.println("Enter Mark3 : ");
        int m3 = sc.nextInt();

        Result r = new Result(roll, name, m1, m2, m3);

        System.out.println("\n ==== Mark Sheet =====");
        r.displayResult();
        sc.close();
    }
}
