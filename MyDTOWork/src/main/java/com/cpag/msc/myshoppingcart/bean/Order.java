package com.cpag.msc.myshoppingcart.bean;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private int totalCost;
	
	@OneToMany
	@JoinColumn(name = "orderValue")
	private List<Product> product;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int totalCost, List<Product> product) {
		super();
		this.totalCost = totalCost;
		this.product = product;
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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", totalCost=" + totalCost + ", product=" + product + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + totalCost;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (totalCost != other.totalCost)
			return false;
		return true;
	}
	
	
}
