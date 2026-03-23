package vit.devops.macse693.Project01;

public class Savings extends Account {

    String operationType;

    public Savings(String accNo, String bankName, int balance) {
        super(accNo, bankName, balance);
    }

    public void operation(String args) {
        System.out.println("Savings operation: " + args);
    }
}
