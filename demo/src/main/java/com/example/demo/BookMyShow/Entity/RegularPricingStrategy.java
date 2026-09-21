package com.example.demo.BookMyShow.Entity;

public class RegularPricingStrategy implements SeatPricingStrategy{
    public double calcSeatPrice(double baseShowPrice){
        return baseShowPrice;
    }

}
