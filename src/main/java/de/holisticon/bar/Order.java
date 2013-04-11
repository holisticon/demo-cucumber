package de.holisticon.bar;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private final List<OrderItem> orderItems = new ArrayList<OrderItem>();

	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}

	public List<OrderItem> getAllOrderItems() {
		final List<OrderItem> aCopyOfAllOrderItems = new ArrayList<OrderItem>();
		aCopyOfAllOrderItems.addAll(orderItems);
		return aCopyOfAllOrderItems;
	}

}
