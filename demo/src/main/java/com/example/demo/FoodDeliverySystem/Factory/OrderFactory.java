package com.example.demo.FoodDeliverySystem.Factory;
import com.example.demo.FoodDeliverySystem.Entity.MenuItem;
import com.example.demo.FoodDeliverySystem.Entity.Order;
import com.example.demo.FoodDeliverySystem.Entity.PaymentStrategy;
import com.example.demo.FoodDeliverySystem.Entity.Restaurant;
import com.example.demo.FoodDeliverySystem.Entity.User;

import java.util.List;

public interface OrderFactory {
    public Order createOrder(Restaurant restaurant, User user, List<MenuItem> items, PaymentStrategy ps,double price);
}
