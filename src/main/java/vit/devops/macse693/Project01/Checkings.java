package vit.devops.macse693.Project01;

public class Checkings extends Account {

    int currentBalance;

    public Checkings(String accNo, String bankName, int balance) {
        super(accNo, bankName, balance);
        this.currentBalance = balance;
    }

    public void transaction(String type) {
        System.out.println("Checkings transaction: " + type);
    }
}
