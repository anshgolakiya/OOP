import java.util.*;
class BankAccount{
    String accountNumber ;
    String accountHolderName ;
    double balance ;
    void OpenAccount(String accNum , String accHolderName , double bal){
        accountNumber = accNum ;
        accountHolderName = accHolderName ;
        balance = bal ;
    }
    void deposit(double amount){
        balance += amount ;
    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance.");
        }else{
            balance -= amount ;
        }
    }
    void checkBalance(){
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Account Holder Name : " + accountHolderName);
        System.out.println("Balance             : " + balance);
    }
}
class SavingAccount extends BankAccount {
    double interestRate = 5.0 ;
    void calculateInterest(){
        double interest = (balance * interestRate) / 100 ;
        System.out.println("Interest Earned : " + interest);
    }
}
class FixedDepositAccount extends BankAccount {
    double interestRate = 7.0 ;
    void maturityAmount(int years){
        double maturityAmount = balance + (balance * interestRate * years) / 100 ;
        System.out.println("Maturity Amount after " + years + " years : " + maturityAmount);
    }
}
public class pr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for open saving account.");
        System.out.println("Press 2 for open fixed deposit account.");
        System.out.println("Press 3 for deposit amount.");
        System.out.println("Press 4 for withdraw amount.");
        System.out.println("Press 5 for check balance.");
        System.out.println("Press 6 for calculate interest of saving account.");
        System.out.println("Press 7 for calculate maturity amount of fixed deposit account.");
        System.out.println("Press 8 for exit a program.");
        int choice ;
        SavingAccount savAcc = new SavingAccount();
        FixedDepositAccount fdAcc = new FixedDepositAccount();
        do{
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Enter account number : ");
                    String accNum1 = sc.next();
                    System.out.println("Enter account holder name : ");
                    String accHolderName1 = sc.next();
                    System.out.println("Enter initial balance : ");
                    double bal1 = sc.nextDouble();
                    savAcc.OpenAccount(accNum1, accHolderName1, bal1);
                    System.out.println("Saving account opened successfully.");
                    break ;
                case 2 :
                    System.out.println("Enter account number : ");
                    String accNum2 = sc.next();
                    System.out.println("Enter account holder name : ");
                    String accHolderName2 = sc.next();
                    System.out.println("Enter initial balance : ");
                    double bal2 = sc.nextDouble();
                    fdAcc.OpenAccount(accNum2, accHolderName2, bal2);
                    System.out.println("Fixed deposit account opened successfully.");
                    break ;
                case 3 :
                    System.out.println("Enter amount to deposit : ");
                    double depAmount = sc.nextDouble();
                    savAcc.deposit(depAmount);
                    
                    break ;
                case 4 :
                    System.out.println("Enter amount to withdraw : ");
                    double withAmount = sc.nextDouble();
                    savAcc.withdraw(withAmount);
                    break ;
                case 5 :
                    System.out.println("Saving Account Details : ");
                    savAcc.checkBalance();
                    System.out.println("Fixed Deposit Account Details : ");
                    fdAcc.checkBalance();
                    break ;
                case 6 :
                    System.out.println("interest of saving account : ");
                    savAcc.calculateInterest();
                    break ;
                case 7 :
                    System.out.println("Enter number of years for maturity : ");
                    int years = sc.nextInt();
                    fdAcc.maturityAmount(years);
                    break ;
                case 8 :
                    System.out.println("Exiting.......");
                    break ;
                default :
                    System.out.println("Enter a valid choice.");
            }
    }while (choice != 8); 
        sc.close();
    }
}