package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.DarkStore;
import com.example.demo.Blinkit.Entity.DeliveryPartner;
import com.example.demo.Blinkit.Entity.Location;

import java.util.List;

public class NearestDeliveryPartner implements DeliveryPartnerMatchingStrategy{
    public DeliveryPartner assignDeliveryPartner(Location darkHouseLoc, List<DeliveryPartner> deliveryPartners){
        double minDist=Double.MAX_VALUE;
        DeliveryPartner bestDeliveryPartner=null;
        for(DeliveryPartner deliveryPartner:deliveryPartners){
            if(deliveryPartner.getLoc().getDist(darkHouseLoc)<minDist){
                minDist=deliveryPartner.getLoc().getDist(darkHouseLoc);
                bestDeliveryPartner=deliveryPartner;
            }
        }
        return bestDeliveryPartner;
    }
}
