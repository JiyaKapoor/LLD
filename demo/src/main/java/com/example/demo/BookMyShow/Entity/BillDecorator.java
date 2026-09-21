package com.example.demo.BookMyShow.Entity;

public abstract class BillDecorator implements Bill{
    Bill bill;
    public BillDecorator(Bill bill){
        this.bill=bill;
    }
    @Override
    public double calcTicketPrice(){
        return bill.calcTicketPrice();
    }
}
