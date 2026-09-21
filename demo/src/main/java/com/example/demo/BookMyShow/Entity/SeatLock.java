package com.example.demo.BookMyShow.Entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SeatLock {
    String seatLockId;
    String userId;
    String seatId;
    LocalDateTime lockTime;
    Long timeOutInSec;
    public boolean isExpired(){
        return LocalDateTime.now().isAfter(lockTime.plusSeconds(timeOutInSec));
    }
}
