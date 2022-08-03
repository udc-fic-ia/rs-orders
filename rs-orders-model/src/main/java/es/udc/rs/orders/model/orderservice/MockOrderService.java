package es.udc.rs.orders.model.orderservice;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import es.udc.rs.orders.model.customer.Customer;
import es.udc.rs.orders.model.order.Order;

public class MockOrderService implements OrderService {

	private Map<Long,Customer> customersMap = new LinkedHashMap<Long,Customer>();
	private Map<Long,Order> ordersMap = new LinkedHashMap<Long,Order>();
	private Map<Long,List<Order>> ordersByCustomerMap = new LinkedHashMap<Long,List<Order>>();

	private long lastCustomerId = 0;
	private long lastOrderId = 0;
	

	private synchronized long getNextCustomerId() {
		return ++lastCustomerId;
	}
	
	private synchronized long getNextOrderId() {
		return ++lastOrderId;
	}
	
}
