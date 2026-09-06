package com.example.demo.FoodDeliverySystem.Factory;

import com.example.demo.FoodDeliverySystem.Entity.Order;

public interface OrderFactory {
    public Order createOrder(String orderType);
}
