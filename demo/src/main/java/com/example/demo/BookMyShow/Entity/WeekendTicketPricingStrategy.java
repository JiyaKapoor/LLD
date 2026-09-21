package com.example.demo.BookMyShow.Entity;

import java.util.List;

public class WeekendTicketPricingStrategy implements TicketPricingStrategy{
    final double weekendSurge=2;
    public double calcTicketPrice(List<Seat> bookedSeats,Show show){
        double cost=0.0;
        for(Seat bookedSeat:bookedSeats){
            cost+=bookedSeat.calcSeatPrice(show.baseShowPrice)*weekendSurge;
        }
        return cost;
    }
}
