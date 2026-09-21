package com.example.demo.BookMyShow.Entity;

public class Seat {
    String seatId;
    SeatType seatType;
    SeatPricingStrategy seatPricingStrategy;
    SeatStatus seatStatus;
    SeatLock seatLock;//This class enc info like the userId who blocked the seat, timeOut of lock
    public double calcSeatPrice(double baseShowPrice){
        return this.seatPricingStrategy.calcSeatPrice(baseShowPrice);
    }
}
