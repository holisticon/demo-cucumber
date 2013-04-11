package de.holisticon.bar;

import java.math.BigDecimal;

public class OrderItem {

	private BigDecimal price;

	private Integer sizeInCl;

	private String name;

	public OrderItem(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getSizeInCl() {
		return sizeInCl;
	}

	public void setSizeInCl(Integer sizeInCl) {
		this.sizeInCl = sizeInCl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
