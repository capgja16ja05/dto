package com.cpag.msc.myshoppingcart.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpag.msc.myshoppingcart.bean.Order;
import com.cpag.msc.myshoppingcart.dto.OrderDTO;
import com.cpag.msc.myshoppingcart.service.IOrderService;

@RestController
@RequestMapping("/or")
public class OderRestController {

	@Autowired
	IOrderService orderService;
	
	public OderRestController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostMapping("/order")
	public OrderDTO webSaveOrder(@RequestBody Order order)
	{
		return orderService.saveOrder(order);
	}
}
