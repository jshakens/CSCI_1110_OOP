import java.util.Date;

public class Account {
private int ID = 0;
private double balance = 0;
private double anualInterestRate = 0;
private Date date = new Date();
    public Account(){
    }

    public Date getDate() {
        return date;
    }

    int getID(){
        return ID;
}
void setID(int newID){
        ID = newID;
}
double getBalance(){
        return balance;
}
void setBalance(double newBalance){
        balance = newBalance;
}
double getAnualInterestRate(){
        return anualInterestRate;
}
void setAnualInterestRate(double newInterest){
        anualInterestRate = newInterest;
}
}
