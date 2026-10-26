package com.alexneri.example.spring.inject_bean_by_name;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alexneri.example.spring.inject_bean_by_name.Client.OrderServiceClient;
import com.alexneri.example.spring.inject_bean_by_name.Service.OrderService;
import com.alexneri.example.spring.inject_bean_by_name.Service.impl.OrderServiceImpl;
import com.alexneri.example.spring.inject_bean_by_name.Service.impl.OrderServiceImpl1;

@Configuration
public class AppRunner {

    @Bean(name = "OrderServiceA")
    public OrderService orderServiceByProvider1() {
        return new OrderServiceImpl();
    }

    @Bean(name = "OrderServiceB")
    public OrderService orderServiceByProvider2() {
        return new OrderServiceImpl1();
    }

    @Bean
    public OrderServiceClient createClient() {
        return new OrderServiceClient();
    }

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderServiceClient bean = context.getBean(OrderServiceClient.class);
        bean.showPendingOrderDetails();
    }

}
