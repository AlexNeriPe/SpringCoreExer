package com.alexneri.example.app;

import org.springframework.stereotype.Component;

import com.alexneri.example.dao.CustomerDao;
import com.alexneri.example.service.OrderService;

@Component 
public class OrderClient {
    private CustomerDao customerDao;
    private OrderService orderService;

    public OrderClient(CustomerDao customerDao, OrderService orderService) {
        this.customerDao = customerDao;
        this.orderService = orderService;
    }

    public void placeOrder(String customerId) {
        Customer customer = customerDao.getCustomer(customerId);
        orderService.placeOrder(customer, "Convertible Thunder");
    }
    
}
