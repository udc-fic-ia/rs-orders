package es.udc.rs.orders.model.orderservice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.udc.rs.orders.model.customer.Customer;
import es.udc.rs.orders.model.order.Order;

public class MockOrderService implements OrderService {

	private static Map<Long,Customer> customersMap = new LinkedHashMap<Long,Customer>();
	private static Map<Long,Order> ordersMap = new LinkedHashMap<Long,Order>();
	private static Map<Long,List<Order>> ordersByCustomerMap = new LinkedHashMap<Long,List<Order>>();

	private static long lastCustomerId = 0;
	private static long lastOrderId = 0;
	

	private static synchronized long getNextCustomerId() {
		return ++lastCustomerId;
	}
	
	private static synchronized long getNextOrderId() {
		return ++lastOrderId;
	}
	
}
