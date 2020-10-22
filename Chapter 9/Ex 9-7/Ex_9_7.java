import java.util.Date;

public class Ex_9_7 {

    public static void main(String[] args) {
    Account account;
    account = new Account();
    account.setID(1122);
    Date date = new Date();
        System.out.println("Account ID: "+account.getID());
        account.setBalance(20000);
        System.out.println(date);
        System.out.println("Balance: $"+account.getBalance());
        account.setAnualInterestRate(4.5);
        System.out.println("Annual interest rate: "+account.getAnualInterestRate()+"%");
        System.out.println("Monthly interest rate: "+getMonthlyInterestRate()+"%");
        System.out.println("Monthly interest amount: $"+getMonthlyInterest());
        System.out.println("Amount withdrawn: $2,500");
        System.out.println("Account balance after withdraw: $"+withdraw());
        System.out.println("Amount to be deposited: $3000");
        System.out.println("New Account balance is: $"+ deposit());

    }
    public static double getMonthlyInterestRate(){
    Account account;
    account = new Account();
    account.setAnualInterestRate(4.5);
    double monthlyInterestRate = account.getAnualInterestRate()/12;
    return monthlyInterestRate;
    }
    public static double getMonthlyInterest(){
    Account account;
    account = new Account();
    account.setAnualInterestRate(.045);
    account.setBalance(20000);
    double monthlyInterest = (account.getAnualInterestRate()/12)*account.getBalance();
    return monthlyInterest;
    }
    public static double withdraw(){
    Account account;
    account = new Account();
    account.setBalance(20000);
    double aaW = account.getBalance()-2500;
    return aaW;
    }
    public static double deposit(){
    Account account;
    account = new Account();
    account.setBalance(withdraw());
    double aaD = account.getBalance()+3000;
    return aaD;
    }
}
