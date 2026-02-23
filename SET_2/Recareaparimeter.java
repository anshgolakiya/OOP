import java.util.*;

class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
        width = 1;
        height = 1;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Recareaparimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rec1 = new Rectangle();
        System.out.println("Rectangle 1 :");
        System.out.println("Width = " + rec1.width);
        System.out.println("Height = " + rec1.height);
        System.out.println("Area = " + rec1.getArea());
        System.out.println("Perimeter = " + rec1.getPerimeter());

        System.out.println("Enter width of rectangle :");
        double w = sc.nextDouble();
        System.out.println("Enter height of rectangle : ");
        double h = sc.nextDouble();

        if (w < 0 || h < 0) {
            System.out.println("Enetr a positive width and height");
        } else {
            Rectangle rec2 = new Rectangle(w, h);
            System.out.println("Rectangle 2 :");
            System.out.println("Width = " + rec2.width);
            System.out.println("Height = " + rec2.height);
            System.out.println("Area = " + rec2.getArea());
            System.out.println("Perimeter = " + rec2.getPerimeter());
        }
        sc.close();
    }
}