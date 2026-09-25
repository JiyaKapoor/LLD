package com.example.demo.Blinkit.Entity;

public class User {
    String userName;
    Location loc;
    public User(String userName,Location loc){
        this.userName=userName;
        this.loc=loc;
    }
    public Location getLoc(){
        return this.loc;
    }
}
