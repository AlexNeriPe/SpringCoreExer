package com.alexneri.example.app;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", toString()=" + super.toString() + "]";
    }

}
