package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.*;
import com.example.demo.FoodDeliverySystem.Factory.OrderFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderManager {
    //again a singleton class designed to manage orders
    static List<Order> currOrders=new ArrayList<>();
    public Order placeOrder(Cart cart, PaymentStrategy paymentStrategy, OrderFactory orderFactory){
        //we have a user cart and now the user wants to place an order with that cart
        User user=cart.user;
        Restaurant restaurant=cart.restaurant;
        List<MenuItem> orderItems=cart.cartItems;
        double cartTotal= cart.computeCartTotal();
        Order order=orderFactory.createOrder(restaurant,user,orderItems,paymentStrategy,cartTotal);
        order.registerObserver(restaurant);
        order.registerObserver(user);//registering them as observers so they receive updates
        order.setStatus("PLACED");
        order.notifyObservers();
        currOrders.add(order);
        return order;
    }
    public void updateOrderStatus(Order order,String newStatus){
        //we need to update the status of an order and send notification to all the observers who have subscribed to the Order class using observer design pattern
        order.setStatus(newStatus);//this internally calls notify observer
    }
}
