package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.DeliveryPartner;
import com.example.demo.Blinkit.Entity.Location;

import java.util.List;

public interface DeliveryPartnerMatchingStrategy {
    public DeliveryPartner assignDeliveryPartner(Location loc, List<DeliveryPartner> deliveryPartners);
}
