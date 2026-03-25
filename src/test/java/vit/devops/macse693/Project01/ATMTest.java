package vit.devops.macse693.Project01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATMTest {

    @Test
    void testATMCreation() {
        ATM atm = new ATM();
        assertNotNull(atm);
    }

    @Test
    void testATMNotNull() {
        ATM atm = new ATM();
        assertTrue(atm != null);
    }

    @Test
    void testMultipleATMObjects() {
        ATM a1 = new ATM();
        ATM a2 = new ATM();
        assertNotEquals(a1, a2);
    }

    @Test
    void testATMBehavior() {
        ATM atm = new ATM();
        assertDoesNotThrow(() -> atm.toString());
    }

    @Test
    void testATMDefaultState() {
        ATM atm = new ATM();
        assertNotNull(atm);
    }
}