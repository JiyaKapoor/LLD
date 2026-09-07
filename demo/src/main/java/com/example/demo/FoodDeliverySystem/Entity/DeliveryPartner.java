package com.example.demo.FoodDeliverySystem.Entity;

public class DeliveryPartner implements OrderObserver{
    public String name;
    public double x;
    public double y;
    public boolean aval;
    @Override
    public void onOrderUpdate(Order order){
        System.out.println("Dear Delivery partner, order # "+ order.orderId+" is in"+order.getStatus()+" stage");
    }
}
