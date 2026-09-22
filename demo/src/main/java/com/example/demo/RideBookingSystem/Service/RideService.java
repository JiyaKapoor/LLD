package com.example.demo.RideBookingSystem.Service;

import com.example.demo.RideBookingSystem.Entity.*;
import com.example.demo.RideBookingSystem.Strategy.DriverMatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class RideService {
    //This service is responsible for matching the user with the apt driver
    @Autowired
    DriverService driverService;
    DriverMatchingStrategy driverMatchingStrategy;
    HashMap<RideType,Double> perKmCharges=new HashMap<>();
    public void setDriverMatchingStrategy(DriverMatchingStrategy driverMatchingStrategy){
        this.driverMatchingStrategy=driverMatchingStrategy;
    }
    public void requestRide(User user, Location destLoc, RideType rideType){
        List<Driver> validDrivers=driverService.registeredDrivers.get(rideType);
        Driver driver=driverMatchingStrategy.findSuitableDriver(validDrivers, user.getLoc());
        //Once the driver is matched we need to compute the fare of the trip
    }
}
