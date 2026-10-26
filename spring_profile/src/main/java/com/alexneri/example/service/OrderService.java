package com.alexneri.example.service;

import com.alexneri.example.app.Customer;

public interface OrderService {
    void placeOrder(Customer customer, String orderDetails);
}
