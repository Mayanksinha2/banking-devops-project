package vit.devops.macse693.Project01;

public class Bank {

    String bankName;
    String bankLocation;

    public Bank(String name, String location) {
        this.bankName = name;
        this.bankLocation = location;
    }

    public void authorizeAccount(String account) {
        System.out.println("Authorizing account: " + account);
    }

    public void manageTransaction() {
        System.out.println("Managing transactions...");
    }
}
