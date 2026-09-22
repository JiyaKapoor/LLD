package com.example.demo.RideBookingSystem.Strategy;

import com.example.demo.RideBookingSystem.Entity.Driver;
import com.example.demo.RideBookingSystem.Entity.DriverStatus;
import com.example.demo.RideBookingSystem.Entity.Location;

import java.util.List;

public class NearestDriverMatching implements DriverMatchingStrategy{
    public Driver findSuitableDriver(List<Driver> drivers, Location userLoc){
        Driver bestDriver=null;
        double minDist=Double.MAX_VALUE;
        for(Driver driver:drivers){
            double currDist=driver.getLoc().findDist(userLoc);
            if (currDist < minDist) {
                minDist=currDist;
                bestDriver=driver;
            }
        }
        return bestDriver;
    }
}
