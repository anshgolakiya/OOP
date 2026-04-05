import java.util.*;
class Shape{
    double d1 , d2 ;
    void getData(double d1 , double d2){
        this.d1 = d1 ;
        this.d2 = d2 ;
    }

}
class Triangle extends Shape {
    double area(){
        return 0.5 * d1 * d2 ;
    }
}
class Rectangle extends Shape {
    double area(){
        return d1 * d2 ;
    }
}
public class pr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for find area of triangle.");
        System.out.println("Press 2 for find area of Rectangle.");
        System.out.println("press 3 exit a program.");
        int choice ;
        do{
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    Triangle t = new Triangle();
                    System.out.println("Enter value of base : ");
                    double d1 = sc.nextDouble();
                    System.out.println("Enter value of height : ");
                    double d2 = sc.nextDouble();
                    t.getData(d1, d2);
                    System.out.println("Area of Triangle : " + t.area());
                    break ;
                case 2 :
                    Rectangle r = new Rectangle() ;
                    System.out.println("Enter value of base : ");
                    double d3 = sc.nextDouble();
                    System.out.println("Enter value of height : ");
                    double d4 = sc.nextDouble();
                    r.getData(d3, d4);
                    System.out.println("Area of Triangle : " + r.area());
                    break ;
                case 3 :
                    System.out.println("Exiting.......");
                    break ;
                default :
                    System.out.println("Enter a valid choice.");
                    break ;
            }
        }while(choice != 3);
        sc.close();
    }
}