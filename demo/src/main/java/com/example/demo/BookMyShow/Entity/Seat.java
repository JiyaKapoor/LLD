package com.example.demo.BookMyShow.Entity;

public abstract class  Seat {
    String seatId;
    SeatStatus seatStatus;
    SeatLock seatLock;//This class enc info like the userId who blocked the seat, timeOut of lock
}
