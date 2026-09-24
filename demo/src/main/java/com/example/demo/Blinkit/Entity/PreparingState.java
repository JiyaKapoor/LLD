package com.example.demo.Blinkit.Entity;

public class PreparingState implements OrderState{
    @Override
    public void cancelOrder(Order order){
        System.out.println("OrderId: "+order.orderId+" cancelled");
    }
}
