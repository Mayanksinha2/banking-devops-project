package vit.devops.macse693.Project01;

public class Deposit extends Transaction {

    String accountNumber;

    public Deposit(java.util.Date date, int amount, String accNo) {
        super(date, "Deposit", amount);
        this.accountNumber = accNo;
    }

    public Deposit() {
        super();
    }
}
