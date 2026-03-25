package vit.devops.macse693.Project01;

import java.util.Date;

public class Transaction {

    Date date;
    String type;
    int amount;

    public Transaction(Date date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public Transaction() {

    }

    public void printReceipt() {
        System.out.println("Transaction Receipt");
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
    }
}
