package vit.devops.macse693.Project01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    void testBankCreation() {
        Bank bank = new Bank();
        assertNotNull(bank);
    }

    @Test
    void testMultipleBanks() {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        assertNotEquals(b1, b2);
    }

    @Test
    void testBankNotNull() {
        Bank bank = new Bank();
        assertTrue(bank != null);
    }

    @Test
    void testBankString() {
        Bank bank = new Bank();
        assertDoesNotThrow(() -> bank.toString());
    }

    @Test
    void testBankInstance() {
        Bank bank = new Bank();
        assertInstanceOf(Bank.class, bank);
    }
}