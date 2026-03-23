package vit.devops.macse693.Project01;

public class Account {

    String accountNumber;
    String bankName;
    int balance;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public void accountSelection(String type) {
        System.out.println("Account selected: " + type);
    }

    public void cashWithdraw(int amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void cashDeposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void mini() {
        System.out.println("Balance: " + balance);
    }

    public void transactions(String transactionType) {
        System.out.println("Transaction Type: " + transactionType);
    }
}
