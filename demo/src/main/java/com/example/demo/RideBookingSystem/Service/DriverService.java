package com.example.demo.RideBookingSystem.Service;

import com.example.demo.RideBookingSystem.Entity.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DriverService {
    Map<RideType, List<Driver>> registeredDrivers=new HashMap<>();
    public void registerDriver(String driverId, String driverName, Vehicle vehicle){
        Driver driver=new Driver(driverId,driverName,vehicle);
        registeredDrivers.computeIfAbsent(vehicle.getRideType(),k-> new ArrayList<>()).add(driver);
        System.out.println("Driver registered succesfully");
    }
}
