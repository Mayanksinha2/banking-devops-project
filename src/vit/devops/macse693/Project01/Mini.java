package vit.devops.macse693.Project01;

public class Mini extends Transaction {

    String accountNumber;

    public Mini(java.util.Date date, String accNo) {
        super(date, "Mini", 0);
        this.accountNumber = accNo;
    }

    public int getBalance(int balance) {
        return balance;
    }
}