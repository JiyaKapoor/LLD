package com.example.demo.Blinkit.Entity;

public class Location {
    double x;
    double y;
    public double getDist(Location loc){
        return this.x-loc.x+this.y-loc.y;
    }
}
