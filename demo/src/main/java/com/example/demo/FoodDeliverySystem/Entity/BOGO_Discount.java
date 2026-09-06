package com.example.demo.FoodDeliverySystem.Entity;

public class BOGO_Discount implements DiscountStrategy{
    @Override
    public double computeDiscount(){
        return 0;
    }

}
