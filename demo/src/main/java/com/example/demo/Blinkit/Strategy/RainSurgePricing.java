package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.Cart;

public class RainSurgePricing implements PricingStrategy{
    double rainSurgeMultiplier;
    public RainSurgePricing(double rainSurgeMultiplier){
        this.rainSurgeMultiplier=rainSurgeMultiplier;
    }
    public double calculatePrice(Cart cart){
        return cart.itemsSubtotal()*rainSurgeMultiplier;
    }
}
