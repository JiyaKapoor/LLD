package com.example.demo.Blinkit.Entity;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    Map<Product,Integer> inventory;
    public InventoryManager(){
        this.inventory=new HashMap<>();
        this.inventory.put(new Product(123,"Tata Salt",100),10);
        this.inventory.put(new Product(453,"Harvest Bread",45),1);
    }
    public boolean canSatisfy(Map<Product,Integer> cartItems){
        for(Product p:cartItems.keySet()){
            Integer available=inventory.get(p);
            if(available==null || available<cartItems.get(p)){
                return false;
            }
        }
        return true;
    }

}
