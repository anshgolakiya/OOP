public class pr1 {
    public static void main(String[] args) {
        try{
            if(args.length < 2){
                throw new ArrayIndexOutOfBoundsException("Please provide two arguments.");

            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator ;

            System.out.println("Numerator : " + numerator);
            System.out.println("Denominator : " + denominator);
            System.err.println("Result : " + result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Missing arguments. Please enter numerator and denominator.");
        }
        catch(NumberFormatException e){
            System.out.println("Error : Invalid input. Please enter integers only.");
        }
        catch(ArithmeticException e){
            System.out.println("Error : Cannot divide by Zero.");
        }
        catch(Exception e){
            System.out.println("Unexpected Error : " + e.getMessage());
        }
    }
}
