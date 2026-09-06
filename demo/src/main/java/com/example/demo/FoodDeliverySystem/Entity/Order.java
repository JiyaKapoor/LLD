package com.example.demo.FoodDeliverySystem.Entity;

import java.util.List;

public class Order {
    int orderId;
    Restaurant restaurant;
    User user;
    List<MenuItem> orderItems;
    PaymentStrategy paymentStrategy; // can be UPI/netBanking/Card etc
    double price;
}
