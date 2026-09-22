package com.example.demo.RideBookingSystem.Entity;

public class Location {
    double x;
    double y;
    public double findDist(Location dest){
        return (this.x-dest.y)+(this.y-dest.y);
    }
}
