package com.alexneri.example.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.alexneri.example.app.Customer;

@Service
@Profile("local")
public class InMemoryOrderService implements OrderService{
        @Override
        public void placeOrder(Customer customer, String orderDetails) {
            System.out.println("InMemoryOrderService: order placed by " + customer + " details: " + orderDetails);
        }

}
