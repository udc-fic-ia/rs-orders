package es.udc.rs.orders.test.model.orderservice;

import es.udc.rs.orders.model.orderservice.OrderService;
import es.udc.rs.orders.model.orderservice.OrderServiceFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderServiceTest {

    private static OrderService orderService = null;

    @BeforeAll
    public static void init() {
        orderService = OrderServiceFactory.getService();

    }
    @Test
    public void testAddCustomerAndFindCustomer()  {
        assertTrue(orderService != null);
    }

}
