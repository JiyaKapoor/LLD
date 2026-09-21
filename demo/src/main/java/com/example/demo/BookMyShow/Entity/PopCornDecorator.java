package com.example.demo.BookMyShow.Entity;

public class PopCornDecorator extends BillDecorator {
    public PopCornDecorator(Bill bill){
        super(bill);//populating the parent's bill object
    }
    @Override
    public double calcTicketPrice(){
        return bill.calcTicketPrice()+100.0;//Since this is a child class so it inherits the parent's field
    }
}
