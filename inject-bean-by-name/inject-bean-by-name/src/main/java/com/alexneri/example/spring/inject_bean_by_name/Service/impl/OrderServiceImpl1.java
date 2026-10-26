package com.alexneri.example.spring.inject_bean_by_name.Service.impl;

import com.alexneri.example.spring.inject_bean_by_name.Service.OrderService;

public class OrderServiceImpl1 implements OrderService {

    public String getOrderDetails(String orderId) {
        return "Order Details from impl1, for order id=" + orderId;
    }
    
    
}