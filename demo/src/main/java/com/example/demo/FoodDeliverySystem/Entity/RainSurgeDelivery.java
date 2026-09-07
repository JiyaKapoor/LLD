package com.example.demo.FoodDeliverySystem.Entity;

public class RainSurgeDelivery implements DeliveryPricingStrategy{
    static int perKmRainDelivery;
    @Override
    public double computeDelivery(Restaurant restaurant,User user){
        double dist=(restaurant.x-user.x)-(restaurant.y- user.y);
        return dist*perKmRainDelivery;
    }
}
