import java.util.*;
interface Classify {
    String getDivision(double average) ;
}
class Result implements Classify {
    public String getDivision(double average){
        if(average >= 60){
            return "First Division" ;
        }
        else{
            return "No first Division" ;
        }
    }
}
public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter average marks : ");
        double avg = sc.nextDouble();

        Classify obj = new Result();

        String division = obj.getDivision(avg);

        System.out.println("Division : " + division);
        sc.close();
    }
}
