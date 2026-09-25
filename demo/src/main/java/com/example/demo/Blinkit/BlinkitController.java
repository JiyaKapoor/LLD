package com.example.demo.Blinkit;

import com.example.demo.Blinkit.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;

public class BlinkitController {

    public static void main(String[] args){
        Blinkit blinkit=new Blinkit();
        User user=new User("jiya@123",new Location(2.0,4.0));
        blinkit.addDarkStore(new DarkStore("DS001",new Location(3.0,3.0),new InventoryManager()));
        blinkit.addDeliveryPartner(new DeliveryPartner(new Location(3.1,3.1), DeliveryPartnerStatus.AVAILABLE));
        blinkit.addToCart(user,new Product(123,"Tata Salt",100),1);
        blinkit.addToCart(user,new Product(453,"Harvest Bread",45),1);
        Order order=blinkit.placeOrder(blinkit.getCart(user));
        blinkit.dispatchOrder(order);
        blinkit.cancelOrder(order);
    }
}
