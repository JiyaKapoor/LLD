package com.example.demo.BookMyShow.Factory;

import com.example.demo.BookMyShow.Entity.Ticket;
import com.example.demo.BookMyShow.Entity.TicketPricingStrategy;
import com.example.demo.BookMyShow.Entity.WeekDayPricingStrategy;
import com.example.demo.BookMyShow.Entity.WeekendTicketPricingStrategy;

public class TicketPricingStrategyFactory {
    public TicketPricingStrategy createTicketPricingStrategy(String dayType){
        if(dayType.equals("WEEKDAY")){
            return new WeekDayPricingStrategy();
        }
        return new WeekendTicketPricingStrategy();
    }
}
