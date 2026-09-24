package com.example.demo.Blinkit.Entity;

import java.util.Map;

public class InventoryManager {
    Map<Product,Integer> inventory;
    public boolean canSatisfy(Map<Product,Integer> cartItems){
        for(Product p:cartItems.keySet()){
            if(inventory.get(p)< cartItems.get(p)){
                return false;
            }
        }
        return true;
    }

}
