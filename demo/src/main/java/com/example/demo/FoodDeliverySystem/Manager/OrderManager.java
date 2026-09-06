package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderManager {
    //again a singleton class designed to manage orders
    List<Order> currOrders;
}
