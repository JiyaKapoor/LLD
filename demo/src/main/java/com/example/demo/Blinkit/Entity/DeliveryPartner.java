package com.example.demo.Blinkit.Entity;

public class DeliveryPartner {
    Location loc;
    DeliveryPartnerStatus status;
    public DeliveryPartner(Location loc, DeliveryPartnerStatus status){
        this.loc=loc;
        this.status=status;
    }
    public void setStatus(DeliveryPartnerStatus deliveryPartnerStatus){
        this.status=deliveryPartnerStatus;
    }
    public Location getLoc(){
        return this.loc;
    }
}
