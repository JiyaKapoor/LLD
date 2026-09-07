package com.example.demo.FoodDeliverySystem.Entity;

public class RainSurgeDelivery implements DeliveryPricingStrategy{
    @Override
    public double computeDelivery(Restaurant restaurant,User user){
        return 0;
    }
}
