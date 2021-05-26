package com.cpag.msc.myshoppingcart.dto;

import java.util.List;

import com.cpag.msc.myshoppingcart.bean.Product;

public class OrderDTO {

	private int orderId;
	private int totalCost;
	private List<Product> products;
	private String customerName;
	private String customerAdress;
	
	// bean class
	
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(int orderId, int totalCost, List<Product> products) {
		super();
		this.orderId = orderId;
		this.totalCost = totalCost;
		this.products = products;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
