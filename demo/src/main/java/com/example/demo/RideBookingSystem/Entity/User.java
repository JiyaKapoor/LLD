package com.example.demo.RideBookingSystem.Entity;

public class User implements Observer{
    String userId;
    String userName;
    Location loc;
    public Location getLoc(){
        return this.loc;
    }
    @Override
    public void onUpdate(String message) {

    }
}
