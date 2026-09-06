package com.example.demo.FoodDeliverySystem.Manager;

import com.example.demo.FoodDeliverySystem.Entity.Restaurant;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantManager {
    //this will be a singleton class which means that only one instance or obj of this class can be created
    List<Restaurant> avalRestaurants;
}
