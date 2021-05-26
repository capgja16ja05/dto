package com.cpag.msc.myshoppingcart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cpag.msc.myshoppingcart.bean.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
