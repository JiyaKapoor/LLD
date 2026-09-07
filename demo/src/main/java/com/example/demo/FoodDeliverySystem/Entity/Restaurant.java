package com.example.demo.FoodDeliverySystem.Entity;

import jakarta.persistence.Entity;

import java.util.List;
@Entity
public class Restaurant {
    int id;
    String name;
    String address;
    List<MenuItem> menu;
}
