class Rectangle{
    double width ;
    double height ;

    Rectangle(double w , double h) {
        width = w ;
        height = h ;
    }
    double getArea(){
        return width * height ;
    }
    double getPerimeter(){
        return 2 * (width + height) ;
    }
    void display() {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
        System.out.println("=================");
    }
}
public class Recarprcompair {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,40) ;
        Rectangle r2 = new Rectangle(3.5, 35.9) ;
        System.out.println("Rectangle 1 Details : ");
        r1.display();
        System.out.println("Rectangle 2 Details : ");
        r2.display();

        if(r1.getArea() > r2.getArea()){
            System.out.println("Ractangle 1 has a larger area.");
        }
        else if(r2.getArea() > r1.getArea()){
            System.out.println("Rectangle 2 has a larger area.");
        }
        else{
            System.out.println("Both rectangle have equal area.");
        }
    }
}
