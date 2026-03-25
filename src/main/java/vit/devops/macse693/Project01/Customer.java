package vit.devops.macse693.Project01;

public class Customer {

    String customerName;
    int customerPhoneNumber;
    String customerEmailID;
    String userID;

    public Customer(String name, int phone, String email, String id) {
        this.customerName = name;
        this.customerPhoneNumber = phone;
        this.customerEmailID = email;
        this.userID = id;
    }

    public Customer() {
    }

    public String selectOptions(String option) {
        System.out.println("Option Selected: " + option);
        return option;
    }

    public void updateInformation(String info) {
        System.out.println("Updating customer information: " + info);
    }

    public void depositOrWithdrawal(int amount) {
        System.out.println("Processing amount: " + amount);
    }
}