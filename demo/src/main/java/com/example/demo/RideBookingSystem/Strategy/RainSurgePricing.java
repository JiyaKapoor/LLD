package com.example.demo.RideBookingSystem.Strategy;

public class RainSurgePricing implements PricingStrategy{
    public double calcTripFare(double baseCost){
        return baseCost*1.5;//(this 1.5 can also be made an attribute of this class)
    }
}
