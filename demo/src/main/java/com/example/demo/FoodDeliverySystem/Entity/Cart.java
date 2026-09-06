package com.example.demo.FoodDeliverySystem.Entity;

import java.util.List;

public class Cart {
    Restaurant restaurant;
    User user;
    List<MenuItem> cartItems;
    DeliveryPricingStrategy deliveryPricingStrategy;
    DiscountStrategy discountStrategy;
    public double computeCartTotal(){
        double total=0;
        for(MenuItem menuItem:cartItems){
            total+=menuItem.price;
        }
        //now we apply the delivery fees (Strategy design pattern)
        total+= deliveryPricingStrategy.computeDelivery();
        //now we need to apply discount (if any)
        total-= discountStrategy.computeDiscount();
        return total;
    }
}