package com.example.demo.Blinkit.Entity;

public class DispatchedState implements OrderState{
    @Override
    public void cancelOrder(Order order){
        System.out.println("Order dispatched already, can't Cancel Now!");
    }
}
