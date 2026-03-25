package vit.devops.macse693.Project01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import vit.devops.macse693.Project01.Account;

public class BankAccountTest {

    @Test
    void testDeposit() {
        Account acc = new Account("123", "SBI", 1000);
        acc.cashDeposit(500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        Account acc = new Account("123", "SBI", 1000);
        acc.cashWithdraw(300);
        assertEquals(700, acc.getBalance());
    }

    @Test
    void testInsufficientBalance() {
        Account acc = new Account("123", "SBI", 1000);
        acc.cashWithdraw(2000);
        assertEquals(1000, acc.getBalance()); // should not change
    }

    @Test
    void testInitialBalance() {
        Account acc = new Account("123", "SBI", 2000);
        assertEquals(2000, acc.getBalance());
    }

    @Test
    void testMultipleTransactions() {
        Account acc = new Account("123", "SBI", 1000);
        acc.cashDeposit(500);
        acc.cashWithdraw(200);
        assertEquals(1300, acc.getBalance());
    }
}