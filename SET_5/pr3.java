import java.util.Scanner;
abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}
class Car extends Vehicle {
    String fuel ;
    Car(String fuel){
        this.fuel = fuel ;
    }
    String fuelType(){
        return fuel ;
    }
    int noOfWheels(){
        return 4 ;
    }
}
class Bike extends Vehicle{
    String fuelType(){
        return "Petrol" ;
    }
    int noOfWheels(){
        return 2 ;
    }
}
public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fuel type for car : ");
        String fuel = sc.nextLine();
        Car car = new Car(fuel);
        Bike bike = new Bike();
        System.out.println("Car Details : ");
        System.out.println("Fuel Type : " + car.fuelType());
        System.out.println("Number of Wheels : " + car.noOfWheels());
        System.out.println("Bike Details : ");
        System.out.println("Fuel Type : " + bike.fuelType());
        System.out.println("Number of Wheels : " + bike.noOfWheels());
        sc.close();
    }
}
