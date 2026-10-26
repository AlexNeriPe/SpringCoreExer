package com.alexneri.example.spring.inject_bean_by_name.Client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.alexneri.example.spring.inject_bean_by_name.Service.OrderService;

public class OrderServiceClient {

    @Autowired
    @Qualifier("OrderServiceB")
    private OrderService orderService;

    public void showPendingOrderDetails() {
        for(String orderId : Arrays.asList("100", "200", "300")) {
            System.out.println(orderService.getOrderDetails(orderId));
        }
    }

}
