package com.example.demo.FoodDeliverySystem.Entity;

public class StandardDistanceDelivery implements DeliveryPricingStrategy{
    static public int perKmDelivery;
    public void setPerKmDelivery(int perKmDelivery){
        StandardDistanceDelivery.perKmDelivery =perKmDelivery;
    }
    @Override
    public double computeDelivery(Restaurant restaurant,User user) {
        double distance= (restaurant.x- user.x)+(restaurant.y-user.y);
        return distance*perKmDelivery;
    }
}
