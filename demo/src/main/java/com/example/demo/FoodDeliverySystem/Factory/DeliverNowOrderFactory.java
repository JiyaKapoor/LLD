package com.example.demo.FoodDeliverySystem.Factory;

import com.example.demo.FoodDeliverySystem.Entity.*;
import com.example.demo.FoodDeliverySystem.Entity.MenuItem;
import com.example.demo.FoodDeliverySystem.Manager.DeliveryPartnerManager;
import com.example.demo.FoodDeliverySystem.Entity.User;

import java.util.List;

public class DeliverNowOrderFactory implements OrderFactory{
    //This factory will assign the delivery partner to the order
    @Override
    public Order createOrder(Restaurant restaurant, User user, List<MenuItem> items, PaymentStrategy ps,double price){
        DeliverNowOrder order=new DeliverNowOrder();
        order.restaurant=restaurant;
        order.user=user;
        order.orderItems=items;
        order.price=price;
        DeliveryPartner deliveryPartner= DeliveryPartnerManager.assignPartner(order.getRestaurant());
        order.assignDeliveryPartner(deliveryPartner);
        order.registerObserver(deliveryPartner);
        return order;
    }
}
