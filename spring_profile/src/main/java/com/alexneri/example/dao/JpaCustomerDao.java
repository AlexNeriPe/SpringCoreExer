package com.alexneri.example.dao;

import org.springframework.stereotype.Repository;

import com.alexneri.example.app.Customer;

@Repository 
public class JpaCustomerDao implements CustomerDao {

    @Override
    public Customer getCustomer(String id) {
        return loadCustomerById(id);
    }

    private Customer loadCustomerById(String id) {
        return new Customer("db-loaded-customer, id: " + id);
    }   
    
}
