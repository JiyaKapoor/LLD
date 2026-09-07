package com.example.demo.FoodDeliverySystem.Entity;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Restaurant implements OrderObserver{
    int id;
    String name;
    String address;
    List<MenuItem> menu;
    public double x;
    public double y;
    @Override
    public void onOrderUpdate(Order order){
        System.out.println("Order #"+order.orderId+" is in the"+order.getStatus()+" stage");
    }
}
