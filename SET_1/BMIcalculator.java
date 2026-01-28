import java.util.* ;
public class BMIcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds : ");
        double weightpounds = sc.nextDouble();
        System.out.println("Enter height in inches : ");
        double heightinches = sc.nextDouble();
        if(weightpounds < 0 && heightinches < 0) {
            System.out.println("Enter valid weight and hight");
        }
        else {
            double weightkg = weightpounds * 0.45359237 ;
            double heightmeters = heightinches * 0.0254 ;
            double bmi = weightkg / (heightmeters * heightmeters) ;
            System.out.println("BMI is : " + bmi) ;
            sc.close();
        }
    }
}
