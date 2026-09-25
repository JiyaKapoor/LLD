package com.example.demo.Blinkit;

import com.example.demo.Blinkit.Entity.*;
import com.example.demo.Blinkit.Service.CartService;
import com.example.demo.Blinkit.Service.DarkStoreService;
import com.example.demo.Blinkit.Service.DeliveryPartnerService;
import com.example.demo.Blinkit.Service.OrderService;

public class Blinkit {
    CartService cartService;
    OrderService orderService;
    DarkStoreService darkStoreService;
    DeliveryPartnerService deliveryPartnerService;
    public Blinkit(){
        this.cartService=new CartService();
        this.darkStoreService=new DarkStoreService();
        this.deliveryPartnerService=new DeliveryPartnerService();
        // share the same service instances used by addDarkStore / addDeliveryPartner
        this.orderService=new OrderService(darkStoreService, deliveryPartnerService);
    }
    //There can be multiple subsytems like the UserService etc
    public void addToCart(User user, Product product, int qty){
        cartService.addToCart(user,product,qty);
    }
    public Cart getCart(User user){
        return cartService.getUserCart(user);
    }
    public Order placeOrder(Cart cart){
        return orderService.placeOrder(cart);
    }
    public void cancelOrder(Order order){
        orderService.cancelOrder(order);
    }
    public void dispatchOrder(Order order){
        orderService.dispatchOrder(order);
    }
    public void addDarkStore(DarkStore darkStore){
        darkStoreService.addDarkStore(darkStore);
    }
    public void addDeliveryPartner(DeliveryPartner deliveryPartner){
        deliveryPartnerService.addDeliveryPartner(deliveryPartner);
    }
}
