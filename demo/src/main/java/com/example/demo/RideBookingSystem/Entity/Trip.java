package com.example.demo.RideBookingSystem.Entity;

import java.util.ArrayList;
import java.util.List;

public class Trip {
    int tripId;
    Driver driver;
    User user;
    double fare;
    List<Observer> observers=new ArrayList<>();
    TripStatus tripStatus;
    public Trip(int tripId,Driver driver,User user,double fare){
        this.tripId=tripId;
        this.driver=driver;
        this.user=user;
        this.fare=fare;
        this.tripStatus=TripStatus.ASSIGNED;
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.onUpdate(tripStatus);
        }
    }
    public void updateStatus(TripStatus tripStatus){
        this.tripStatus=tripStatus;
        notifyObservers();
    }
}
