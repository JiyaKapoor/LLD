package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.DeliveryPartner;
import com.example.demo.Blinkit.Entity.Location;
import com.example.demo.Blinkit.Strategy.DeliveryPartnerMatchingStrategy;
import com.example.demo.Blinkit.Strategy.NearestDeliveryPartner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DeliveryPartnerService {
    @Autowired
    DeliveryPartnerMatchingStrategy deliveryPartnerMatchingStrategy;
    final List<DeliveryPartner> deliveryPartners=new ArrayList<>();
    public DeliveryPartnerService(){
        this.deliveryPartnerMatchingStrategy=new NearestDeliveryPartner();
    }
    public void addDeliveryPartner(DeliveryPartner deliveryPartner){
        deliveryPartners.add(deliveryPartner);
    }
    public DeliveryPartner assignDeliveryPartner(Location loc) {
        return deliveryPartnerMatchingStrategy.assignDeliveryPartner(loc,deliveryPartners);
    }
}
