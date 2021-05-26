package com.cpag.msc.myshoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpag.msc.myshoppingcart.bean.Order;
import com.cpag.msc.myshoppingcart.dao.OrderRepository;
import com.cpag.msc.myshoppingcart.dto.OrderDTO;

@Service
public class IOrderServiceImpl implements IOrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public OrderDTO saveOrder(Order order) {
		Order savededOrder = orderRepository.save(order);
		
		// Data transfer Object
		OrderDTO orderDTO = new OrderDTO(order.getOrderId(), order.getTotalCost(), order.getProduct());
		return orderDTO;
	}

}
