package com.example.demo.Blinkit.Entity;

import java.util.Map;

public class Cart {
    String cartId;
    User user;
    Map<Product,Integer> cartItems;
    public Cart(String cartId,User user,Map<Product,Integer> cartItems){
        this.cartId=cartId;
        this.user=user;
        this.cartItems=cartItems;
    }
    public void addItem(Product product,int qty){
        this.cartItems.put(product,this.cartItems.getOrDefault(product,0)+qty);
    }
    public double itemsSubtotal(){
        double itemsSubtotal=0;
        for(Product p:cartItems.keySet()){
            itemsSubtotal+=p.price;
        }
        return itemsSubtotal;
    }
    public Map<Product,Integer> getCartItems(){
        return this.cartItems;
    }
    public User getUser(){
        return this.user;
    }
}
