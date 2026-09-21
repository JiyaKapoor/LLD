package com.example.demo.BookMyShow.Entity;

import java.util.List;

public class Ticket implements Bill{
    String ticketId;
    String theatreId;
    Show show;
    List<Seat> seatsBooked;
    TicketPricingStrategy ticketPricingStrategy;
    public Ticket(String theatreId,Show show,List<Seat> seatsBooked,TicketPricingStrategy ticketPricingStrategy){
        this.theatreId=theatreId;
        this.show=show;
        this.seatsBooked=seatsBooked;
        this.ticketPricingStrategy=ticketPricingStrategy;
    }
    public double calcTicketPrice(){
        return ticketPricingStrategy.calcTicketPrice(seatsBooked,show);
    }

}
