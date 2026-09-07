package com.example.demo.FoodDeliverySystem.Entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public abstract class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int orderId;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    public Restaurant restaurant;
    @ManyToOne
    @JoinColumn(name = "user_id")
    public User user;
    public List<MenuItem> orderItems;
    public PaymentStrategy paymentStrategy; // can be UPI/netBanking/Card etc
    public double price;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    abstract String getType();
    public Restaurant getRestaurant(){
        return this.restaurant;
    }
}
