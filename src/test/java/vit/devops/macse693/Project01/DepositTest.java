package vit.devops.macse693.Project01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DepositTest {

    @Test
    void testDepositObject() {
        Deposit d = new Deposit();
        assertNotNull(d);
    }

    @Test
    void testMultipleDeposit() {
        Deposit d1 = new Deposit();
        Deposit d2 = new Deposit();
        assertNotEquals(d1, d2);
    }

    @Test
    void testDepositString() {
        Deposit d = new Deposit();
        assertDoesNotThrow(() -> d.toString());
    }

    @Test
    void testDepositInstance() {
        Deposit d = new Deposit();
        assertInstanceOf(Deposit.class, d);
    }

    @Test
    void testDepositNotNull() {
        Deposit d = new Deposit();
        assertTrue(d != null);
    }
}
