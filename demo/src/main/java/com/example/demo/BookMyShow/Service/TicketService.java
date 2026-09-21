package com.example.demo.BookMyShow.Service;

import com.example.demo.BookMyShow.Entity.*;
import com.example.demo.BookMyShow.Factory.SeatSelectionStrategyFactory;
import com.example.demo.BookMyShow.Factory.TicketPricingStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketService {
    @Autowired
    SeatSelectionStrategyFactory seatSelectionStrategyFactory;
    @Autowired
    TicketPricingStrategyFactory ticketPricingStrategyFactory;
    public void bookTicket(User user,String theatreId, Show show,int numTickets,String seatSelectionStrategy,String DayType){
        SeatSelectionStrategy selectionStrategy=seatSelectionStrategyFactory.createSelectionStrategy(seatSelectionStrategy);
        TicketPricingStrategy ticketPricingStrategy= ticketPricingStrategyFactory.createTicketPricingStrategy(DayType);
        List<Seat> bookedSeats=selectionStrategy.bookSeats(numTickets);
        Ticket ticket=new Ticket(theatreId,show,bookedSeats,ticketPricingStrategy);

    }
}
