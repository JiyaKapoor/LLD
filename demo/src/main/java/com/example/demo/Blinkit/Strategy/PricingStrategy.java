package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.Cart;

public interface PricingStrategy {
    public double calculatePrice(Cart cart);
}
