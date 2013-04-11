package de.holisticon.bar;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	private final Map<String, OrderItem> orderItems = new HashMap<String, OrderItem>();

	public void addOrderItem(OrderItem orderItem) {
		orderItems.put(orderItem.getName(), orderItem);
	}

	public OrderItem getOrderItem(String name) {
		return orderItems.get(name);
	}

}
