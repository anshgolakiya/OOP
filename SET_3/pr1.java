import java.util.*;
class BankAccount{
    String accountHolderName ;
    double balance ;
    static double interest_rate = 10 ;
    BankAccount(String name , double bal){
        accountHolderName = name ;
        balance = bal ;
    }
    double calculateInterest(){
        return (balance * interest_rate) / 100 ;
    }
    void display(){
        System.out.println("Account Holder  : " + accountHolderName);
        System.out.println("Balance         : " + balance);
        System.out.println("Interest Rate   : " + interest_rate + "%");
        System.out.println("Interest Earned : " + calculateInterest());
        System.out.println();
    }
    static void updateInterestRate(double newRate){
        interest_rate = newRate ;
    }
}
public class pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of account : ");
        int num = sc.nextInt();
        BankAccount[] acc = new BankAccount[num];
        for(int i = 0 ; i < num ; i++){
            System.out.println("Enter a details for account no. " + (i+1) + " : ");
            System.out.print("Enter account holder name : ");
            String name = sc.next();
            System.out.print("Enter account balance : ");
            double bal = sc.nextDouble();
            acc[i] = new BankAccount(name, bal);
        }
        System.out.println("Enter new interest rate : ");
        double newRate = sc.nextDouble();
        System.out.println("Before Updating Interest Rate : ");
        for(int i = 0 ; i < num ; i++){
            acc[i].display();
        }
        BankAccount.updateInterestRate(newRate);
        System.out.println("after Updating Interest Rate : ");
        for(int i = 0 ; i < num ; i++){
            acc[i].display();
        }
        sc.close();
    }
}
