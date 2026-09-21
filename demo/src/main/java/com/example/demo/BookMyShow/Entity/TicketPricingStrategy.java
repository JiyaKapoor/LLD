package com.example.demo.BookMyShow.Entity;

import java.util.List;

public interface TicketPricingStrategy {
    public double calcTicketPrice(List<Seat> bookedSeats,Show show);
}
