package com.example.demo.RideBookingSystem.Strategy;

import com.example.demo.RideBookingSystem.Entity.Driver;
import com.example.demo.RideBookingSystem.Entity.DriverStatus;
import com.example.demo.RideBookingSystem.Entity.Location;

import java.util.List;

public interface DriverMatchingStrategy {
    Driver findSuitableDriver(List<Driver> drivers, Location userLoc);
}
