package com.example.demo.Blinkit.Entity;

import com.example.demo.Blinkit.Strategy.DeliveryPartnerMatchingStrategy;

import java.util.Map;

public class Order {
    String orderId;
    User user;
    Map<Product,Integer> items;
    double price;
    DeliveryPartner deliveryPartner;
    public Order(String orderId,User user,Map<Product,Integer> items,double price,DeliveryPartner deliveryPartner){
        this.orderId=orderId;
        this.user=user;
        this.items=items;
        this.price=price;
        this.deliveryPartner=deliveryPartner;
    }
}
