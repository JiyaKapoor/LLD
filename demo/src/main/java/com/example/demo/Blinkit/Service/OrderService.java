package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.*;
import com.example.demo.Blinkit.Strategy.PricingStrategy;
import com.example.demo.Blinkit.Strategy.RainSurgePricing;

import java.util.Map;

public class OrderService {
    int orderCnt=0;
    PricingStrategy pricingStrategy;
    DeliveryPartnerService deliveryPartnerService;
    DarkStoreService darkStoreService;
    public OrderService(DarkStoreService darkStoreService, DeliveryPartnerService deliveryPartnerService){
        this.pricingStrategy=new RainSurgePricing(1.5);
        this.deliveryPartnerService=deliveryPartnerService;
        this.darkStoreService=darkStoreService;
    }
    public Order placeOrder(Cart cart){
        Map<Product,Integer> cartItems=cart.getCartItems();
        double orderTotal=pricingStrategy.calculatePrice(cart);
        DarkStore srcDarkStore=darkStoreService.findBestDarkStore(cartItems,cart.getUser());
        if(srcDarkStore==null){
            throw new IllegalStateException("No dark store can fulfill this cart");
        }
        DeliveryPartner assignedPartner= deliveryPartnerService.assignDeliveryPartner(srcDarkStore.getLoc());
        if(assignedPartner==null){
            throw new IllegalStateException("No delivery partner available");
        }
        assignedPartner.setStatus(DeliveryPartnerStatus.SERVING);
        Order order=new Order("ORDER: "+orderCnt,cart.getUser(),cartItems,orderTotal,assignedPartner);
        orderCnt+=1;
        order.setOrderState(new PreparingState());
        return order;
    }
    public void dispatchOrder(Order order){
        //OBSERVER PATTERN
        order.setOrderState(new DispatchedState());
    }
    public void cancelOrder(Order order){
        order.cancelOrder();
    }
}
