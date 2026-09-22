package com.example.demo.RideBookingSystem;

import com.example.demo.RideBookingSystem.Entity.*;
import com.example.demo.RideBookingSystem.Service.DriverService;
import com.example.demo.RideBookingSystem.Service.RideService;
import com.example.demo.RideBookingSystem.Strategy.DriverMatchingStrategy;
import com.example.demo.RideBookingSystem.Strategy.PricingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideBookingManager {
    @Autowired
    DriverService driverService;
    @Autowired
    RideService rideService;
    public void registerDriver(String driverId, String driverName, Vehicle vehicle){
        driverService.registerDriver(driverId,driverName,vehicle);
    }
    public Trip requestRide(User user, Location destLoc, RideType rideType){
        return rideService.requestRide(user,destLoc,rideType);
    }
    public void startTrip(Trip trip){
        rideService.startTrip(trip);
    }
    public void endTrip(Trip trip){
        rideService.endTrip(trip);
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy){
        rideService.setPricingStrategy(pricingStrategy);
    }
    public void setDriverMetchingStrategy(DriverMatchingStrategy driverMatchingStrategy){
        rideService.setDriverMatchingStrategy(driverMatchingStrategy);
    }
}
