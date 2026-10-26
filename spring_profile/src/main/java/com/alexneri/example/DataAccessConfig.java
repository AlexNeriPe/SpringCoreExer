package com.alexneri.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alexneri.example.dao.CustomerDao;
import com.alexneri.example.dao.InMemoryCustomerDao;
import com.alexneri.example.dao.JpaCustomerDao;

@Configuration 
public class DataAccessConfig {
    @Bean
    @Profile("local")
    public CustomerDao inMemoryCustomerDao() {
        return new InMemoryCustomerDao();
    }

    @Bean
    @Profile("dev")
    public CustomerDao jpaCustomerDao() {
        return new JpaCustomerDao();
    }
    
}
