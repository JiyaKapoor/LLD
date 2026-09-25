package com.example.demo.Blinkit.Entity;

public class Location {
    double x;
    double y;
    public Location(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double getDist(Location loc){
        return this.x-loc.x+this.y-loc.y;
    }
}
