package com.jdk8.test2;
import java.math.BigDecimal;

public class Item {

    private String name;
    private int qty;
    private BigDecimal price;

    
    public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getQty() {
		return qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}