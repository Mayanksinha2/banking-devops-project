package vit.devops.macse693.Project01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void testCustomerCreation() {
        Customer c = new Customer();
        assertNotNull(c);
    }

    @Test
    void testMultipleCustomers() {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        assertNotEquals(c1, c2);
    }

    @Test
    void testCustomerNotNull() {
        Customer c = new Customer();
        assertTrue(c != null);
    }

    @Test
    void testCustomerString() {
        Customer c = new Customer();
        assertDoesNotThrow(() -> c.toString());
    }

    @Test
    void testCustomerInstance() {
        Customer c = new Customer();
        assertInstanceOf(Customer.class, c);
    }
}