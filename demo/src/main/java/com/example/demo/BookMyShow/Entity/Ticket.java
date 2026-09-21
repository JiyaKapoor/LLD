package com.example.demo.BookMyShow.Entity;

import java.util.List;

public class Ticket {
    String ticketId;
    String theatreId;
    Show show;
    List<Seat> seatsBooked;
    TicketPricingStrategy ticketPricingStrategy;
    public double calcTicketPrice(){
        return ticketPricingStrategy.calcTicketPrice(seatsBooked,show);
    }
}
