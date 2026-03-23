package vit.devops.macse693.Project01;

public class Withdrawal extends Transaction {

    String accountNumber;

    public Withdrawal(java.util.Date date, int amount, String accNo) {
        super(date, "Withdrawal", amount);
        this.accountNumber = accNo;
    }

    public int getBalance(int balance) {
        balance -= amount;
        return balance;
    }
}
