package com.example.demo.RideBookingSystem.Service;

import com.example.demo.RideBookingSystem.Entity.*;
import com.example.demo.RideBookingSystem.Strategy.DriverMatchingStrategy;
import com.example.demo.RideBookingSystem.Strategy.PricingStrategy;
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
    PricingStrategy pricingStrategy;
    HashMap<RideType,Double> perKmCharges=new HashMap<>();
    static int tripCtr=0;
    public void setDriverMatchingStrategy(DriverMatchingStrategy driverMatchingStrategy){
        this.driverMatchingStrategy=driverMatchingStrategy;
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy=pricingStrategy;
    }
    public Trip requestRide(User user, Location destLoc, RideType rideType){
        List<Driver> validDrivers=driverService.registeredDrivers.get(rideType);
        Driver driver=driverMatchingStrategy.findSuitableDriver(validDrivers, user.getLoc());
        //Once the driver is matched we need to compute the fare of the trip
        double baseCost=perKmCharges.get(rideType)*user.getLoc().findDist(destLoc);
        double finalTripFare=pricingStrategy.calcTripFare(baseCost);
        tripCtr+=1;
        return new Trip(tripCtr,driver,user,finalTripFare);
    }
    public void startTrip(Trip trip){
        trip.updateStatus(TripStatus.IN_PROGRESS);//internally calls notify observer
    }
    public void endTrip(Trip trip){
        trip.updateStatus(TripStatus.COMPLETED);
    }
}
