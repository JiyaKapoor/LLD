package com.example.demo.FoodDeliverySystem.Entity;

public interface DeliveryPricingStrategy {
    public double computeDelivery(Restaurant restaurant,User user);
}
