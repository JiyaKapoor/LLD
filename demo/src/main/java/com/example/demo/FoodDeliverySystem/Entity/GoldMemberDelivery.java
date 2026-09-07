package com.example.demo.FoodDeliverySystem.Entity;

public class GoldMemberDelivery implements DeliveryPricingStrategy{
    @Override
    public double computeDelivery(Restaurant restaurant,User user){
        return 0;//no delivery fees for gold members
    }
}
