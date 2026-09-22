package com.example.demo.RideBookingSystem.Entity;

public class Driver implements Observer{
    String driverId;
    String driverName;
    Vehicle vehicle;
    DriverStatus driverStatus;
    Location location;
    public Driver(String driverId,String driverName,Vehicle vehicle){
        this.driverId=driverId;
        this.driverName=driverName;
        this.vehicle=vehicle;
        this.driverStatus=DriverStatus.ONLINE;
    }
    public Location getLoc(){
        return this.location;
    }
    @Override
    public void onUpdate(String message) {

    }
}
