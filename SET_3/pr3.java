import java.util.*;
class VolumeCalculator{
    double calculateVolume(double side){
        return side * side * side ;
    }
    double calculateVolume(double length , double width , double height){
        return length * width * height ;
    }
    double calculateVolume(int radius){
        return (4.0 /3.0) * Math.PI * radius * radius * radius ;
    }
}
public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        System.out.println("Press 1 for calculate volume of cube.");
        System.out.println("Press 2 for calculate volume of RectangularCube.");
        System.out.println("Press 3 for calculate volume of Sphere.");
        System.out.println("Prees 4 for exit the program");
        int choice ;
        do{
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Enter side of cube : ");
                    double side = sc.nextDouble();
                    System.err.println("Volume of Cube : " + vc.calculateVolume(side));
                    break;
                case 2 :
                    System.out.println("Enter length of rectangular cube : ");
                    double length = sc.nextDouble();
                    System.out.println("Enter width of rectangular cube : ");
                    double width = sc.nextDouble();
                    System.out.println("Enter height of rectangular cube : ");
                    double height = sc.nextDouble();
                    System.out.println("Volume of Rectangular cube : " + vc.calculateVolume(length, width, height));
                    break;
                case 3 :
                    System.out.println("Enetr radius of sphere : ");
                    int radius = sc.nextInt();
                    System.out.println("Volume of Sphere : " + vc.calculateVolume(radius));
                    break ;
                case 4 :
                    System.out.println("Exiting......");
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }while(choice != 4);
        sc.close();
    }
}
