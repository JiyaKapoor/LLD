package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.*;
import com.example.demo.Blinkit.Strategy.DeliveryPartnerMatchingStrategy;
import com.example.demo.Blinkit.Strategy.PricingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class OrderService {
    int orderCnt=0;
    @Autowired
    PricingStrategy pricingStrategy;
    @Autowired
    DeliveryPartnerService deliveryPartnerService;
    @Autowired
    DarkStoreService darkStoreService;
    public Order placeOrder(Cart cart){
        Map<Product,Integer> cartItems=cart.getCartItems();
        double orderTotal=pricingStrategy.calculatePrice(cart);
        DarkStore srcDarkStore=darkStoreService.findBestDarkStore(cartItems,cart.getUser());
        DeliveryPartner assignedPartner= deliveryPartnerService.assignDeliveryPartner(srcDarkStore.getLoc());
        Order order=new Order("ORDER: "+orderCnt,cart.getUser(),cartItems,orderTotal,assignedPartner);
        orderCnt+=1;
        return order;
    }
    public void dispatchOrder(Order order){
        //OBSERVER PATTERN
    }
}
