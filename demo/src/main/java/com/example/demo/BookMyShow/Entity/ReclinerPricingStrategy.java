package com.example.demo.BookMyShow.Entity;

public class ReclinerPricingStrategy implements SeatPricingStrategy{
    public double calcSeatPrice(double baseShowPrice){
        return baseShowPrice*1.5;
    }

}
