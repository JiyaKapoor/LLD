package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.DeliveryPartner;
import com.example.demo.FoodDeliverySystem.Entity.Order;
import com.example.demo.FoodDeliverySystem.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeliveryPartnerManager {
    @Autowired
    OrderManager orderManager;
    static List<DeliveryPartner> deliveryPartners;
    public static void addDeliveryPartner(DeliveryPartner deliveryPartner){
        deliveryPartners.add(deliveryPartner);
    }
    public static DeliveryPartner assignPartner(Restaurant restaurant){
        //we assign the nearest delivery partner
        double minDist=Double.MAX_VALUE;
        DeliveryPartner suitablePartner=null;
        for(DeliveryPartner deliveryPartner:deliveryPartners){
            if(deliveryPartner.aval){
                double currDist=(restaurant.x-deliveryPartner.x)+(restaurant.y- deliveryPartner.y);
                if(currDist<minDist){
                    minDist=currDist;
                    suitablePartner=deliveryPartner;
                }
            }
        }
        return suitablePartner;
    }
    public void DeliverOrder(Order order){
        orderManager.updateOrderStatus(order,"DELIVERED");
    }
    public void OnTheWayOrder(Order order){
        orderManager.updateOrderStatus(order,"ON THE WAY");
    }
}
