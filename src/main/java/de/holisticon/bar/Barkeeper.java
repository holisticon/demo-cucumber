package de.holisticon.bar;

public class Barkeeper {

	public Drink mixDrinkFor(OrderItem aOrderItem) {
		return new Drink(aOrderItem.getName());
	}

}
