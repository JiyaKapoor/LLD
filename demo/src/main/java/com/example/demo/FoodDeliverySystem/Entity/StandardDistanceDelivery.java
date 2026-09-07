package com.example.demo.FoodDeliverySystem.Entity;

public class StandardDistanceDelivery implements DeliveryPricingStrategy{
    public int perKmDelivery;
    @Override
    public double computeDelivery(Restaurant restaurant,User user) {

        return 0;
    }
}
