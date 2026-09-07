package com.example.demo.FoodDeliverySystem.Entity;

import java.util.List;

public class Cart {
    public Restaurant restaurant;
    public User user;
    public List<MenuItem> cartItems;
    public DeliveryPricingStrategy deliveryPricingStrategy;
    public DiscountStrategy discountStrategy;
    public double computeCartTotal(){
        double total=0;
        for(MenuItem menuItem:cartItems){
            total+=menuItem.price;
        }
        //now we apply the delivery fees (Strategy design pattern)
        total+= deliveryPricingStrategy.computeDelivery(this.restaurant,this.user);
        //now we need to apply discount (if any)
        total-= discountStrategy.computeDiscount();
        return total;
    }
}