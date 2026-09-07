package com.example.demo.FoodDeliverySystem.Entity;

public class DeliverNowOrder extends Order{
    private DeliveryPartner deliveryPartner;
    public void assignDeliveryPartner(DeliveryPartner deliveryPartner){
        this.deliveryPartner=deliveryPartner;
    }
    public DeliveryPartner getAssignedPartner(){
        return this.deliveryPartner;
    }
    public String getType(){
        return "DELIVER NOW";
    }
}
