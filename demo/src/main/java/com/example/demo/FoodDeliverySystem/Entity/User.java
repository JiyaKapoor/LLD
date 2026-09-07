package com.example.demo.FoodDeliverySystem.Entity;

import jakarta.persistence.Entity;

@Entity
public class User implements OrderObserver{
    public int id;
    public String userName;
    public String address;
    public double x;
    public double y;
    @Override
    public void onOrderUpdate(Order order){
        System.out.println("Dear Customer, your order is in"+order.getStatus()+"Stage");
    }
}
