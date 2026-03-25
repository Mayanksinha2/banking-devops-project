package vit.devops.macse693.Project01;

public class Bank {

    String bankName;
    String bankLocation;

    // Parameterized constructor (MAIN one)
    public Bank(String name, String location) {
        this.bankName = name;
        this.bankLocation = location;
    }

    // Default constructor (optional but improved)
    public Bank() {
        this.bankName = "Default Bank";
        this.bankLocation = "Unknown";
    }

    // Getter methods (IMPORTANT for testing)
    public String getBankName() {
        return bankName;
    }

    public String getBankLocation() {
        return bankLocation;
    }

    // Return instead of print
    public boolean authorizeAccount(String account) {
        return account != null && !account.isEmpty();
    }

    public String manageTransaction() {
        return "Transactions Managed";
    }
}