package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.Order;
import com.example.demo.FoodDeliverySystem.Entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantManager {
    @Autowired
    OrderManager orderManager;
    //this will be a singleton class which means that only one instance or obj of this class can be created
    List<Restaurant> avalRestaurants;
    public void addRestaurant(Restaurant restaurant){
        avalRestaurants.add(restaurant);
    }
    public void updateOrderStatus(Order order){
        orderManager.updateOrderStatus(order,"PREPARED");//only this update a restaurant can do
    }
}
