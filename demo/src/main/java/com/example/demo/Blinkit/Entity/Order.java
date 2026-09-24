package com.example.demo.Blinkit.Entity;

import java.util.Map;

public class Order {
    String orderId;
    User user;
    Map<Product,Integer> items;
    double price;

}
