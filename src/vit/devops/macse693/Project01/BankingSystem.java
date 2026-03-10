package vit.devops.macse693.Project01;
import java.util.Date;
public class BankingSystem {
    public static void main(String[] args) {

        ATM atm = new ATM(1234,"Chennai","SBI");

        Customer customer = new Customer(
                "Mayank",
                987654321,
                "mayank@gmail.com",
                "USR101"
        );
        Bank bank = new Bank("SBI","Chennai");

        Account account = new Account("ACC1001","SBI",5000);

        atm.displayOptions();

        account.cashDeposit(1000);

        account.cashWithdraw(500);

        account.mini();

        Transaction t = new Deposit(new Date(),1000,"ACC1001");
        t.printReceipt();
    }
}