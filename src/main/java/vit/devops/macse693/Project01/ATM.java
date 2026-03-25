package vit.devops.macse693.Project01;

public class ATM {

    int pin;
    String location;
    String bankName;

    public ATM(int pin, String location, String bankName) {
        this.pin = pin;
        this.location = location;
        this.bankName = bankName;
    }

    public ATM() {

    }

    public boolean validatePin(int enteredPin) {
        return enteredPin == pin;
    }

    public void selectLanguage(String language) {
        System.out.println("Language Selected: " + language);
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Mini");
    }
}