package com.cpag.msc.myshoppingcart.service;

import com.cpag.msc.myshoppingcart.bean.Order;
import com.cpag.msc.myshoppingcart.dto.OrderDTO;

public interface IOrderService {
	
	public OrderDTO saveOrder(Order order);

}
