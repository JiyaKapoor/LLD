package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.DeliveryPartner;
import com.example.demo.FoodDeliverySystem.Entity.Restaurant;

import java.util.List;

public class DeliveryPartnerManager {
    static List<DeliveryPartner> deliveryPartners;
    public static void addDeliveryPartner(DeliveryPartner deliveryPartner){
        deliveryPartners.add(deliveryPartner);
    }
    public static DeliveryPartner assignPartner(Restaurant restaurant){
        //we assign the nearest delivery partner
    }
}
