package es.udc.rs.orders.model.order;

import java.util.Calendar;

public class Order {

	private Long orderId;
	private Long customerId;
	private Calendar orderDate;
	private Long productId;
	private Long quantity;
	private Double price;
	private OrderStatus orderStatus;

	public Order(Long customerId, Long productId, Long quantity, Double price) {
		super();
		this.customerId = customerId;
		this.productId = productId;
		this.quantity = quantity;
		this.price = price;
	}

	public Order(Long orderId, Long customerId, Calendar orderDate, Long productId, Long quantity, Double price,
			OrderStatus orderStatus) {
		this(customerId, productId, quantity, price);
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public Order(Order order) {
		this(order.orderId, order.customerId, order.orderDate, order.productId, order.quantity, order.price,
				order.orderStatus);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Calendar getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Calendar orderDate) {
		this.orderDate = orderDate;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

}