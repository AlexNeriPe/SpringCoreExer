package com.alexneri.example.dao;

import org.springframework.stereotype.Repository;

import com.alexneri.example.app.Customer;

@Repository 
public class InMemoryCustomerDao implements CustomerDao{

    @Override
    public Customer getCustomer(String id) {
        return loadCustomerById(id);
    }
   
    private Customer loadCustomerById(String id) {
        return new Customer("in-memory-customer, id: " + id);
    }
}
