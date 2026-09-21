package com.example.demo.BookMyShow.Entity;

import java.util.List;

public interface SeatSelectionStrategy {
    List<Seat> bookSeats(int numTickets);
}
