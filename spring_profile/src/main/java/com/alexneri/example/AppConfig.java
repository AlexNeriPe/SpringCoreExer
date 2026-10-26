package com.alexneri.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.ConfigurableEnvironment;

import com.alexneri.example.app.OrderClient;

@Configuration
@ComponentScan({"com.alexneri.example.service", "com.alexneri.example.app"})
@Import(DataAccessConfig.class)
public class AppConfig {
    public static void main(String[] args) {
        runApp("local");
        System.out.println("-----------------");
        runApp("dev");
    }

    private static void runApp(String profileName) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment env = ctx.getEnvironment();
        env.setActiveProfiles(profileName);
        ctx.register(AppConfig.class);
        ctx.refresh();

        OrderClient orderClient = ctx.getBean(OrderClient.class);
        orderClient.placeOrder("customer-1");
    }
}