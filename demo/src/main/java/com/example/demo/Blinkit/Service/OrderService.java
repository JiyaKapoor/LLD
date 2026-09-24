package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.Cart;
import com.example.demo.Blinkit.Entity.DeliveryPartner;
import com.example.demo.Blinkit.Entity.Order;
import com.example.demo.Blinkit.Entity.Product;
import com.example.demo.Blinkit.Strategy.DeliveryPartnerMatchingStrategy;
import com.example.demo.Blinkit.Strategy.PricingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class OrderService {
    int orderCnt=0;
    @Autowired
    PricingStrategy pricingStrategy;
    @Autowired
    DeliveryPartnerMatchingStrategy deliveryPartnerMatchingStrategy;
    public Order placeOrder(Cart cart){
        Map<Product,Integer> cartItems=cart.getCartItems();
        double orderTotal=pricingStrategy.calculatePrice(cart);
        DeliveryPartner assignedPartner= deliveryPartnerMatchingStrategy.assignDeliveryPartner();
        Order order=new Order("ORDER: "+orderCnt,cart.getUser(),cartItems,orderTotal,assignedPartner);
        orderCnt+=1;
        return order;
    }
}
