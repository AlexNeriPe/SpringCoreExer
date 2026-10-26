package com.alexneri.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.alexneri.example.app.Customer;

@Service
@Profile("dev")
public class OrderServiceSimulator implements OrderService{ 
    @Override 
    public void placeOrder(Customer customer, String orderDetails) {
        System.out.println("OrderServiceSimulator: order placed by " + customer + " details: " + orderDetails); 
    }
}
