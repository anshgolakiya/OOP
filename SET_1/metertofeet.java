import java.util.* ;
public class metertofeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a distance in meters : ");
        Double meters = sc.nextDouble();
        if(meters < 0){
            System.out.println("please enter valid input!");
        }
        else{
            System.out.println(meters + " meter = " + meters*3.28084 + " feet");
        }
        sc.close();
    }
}
