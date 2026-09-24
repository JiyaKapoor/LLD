package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.DarkStore;
import com.example.demo.Blinkit.Entity.Product;
import com.example.demo.Blinkit.Entity.User;

import java.util.List;
import java.util.Map;

public interface DarkStoreMatchingStrategy {
    public DarkStore findBestDarkStore(Map<Product,Integer> cartItems, List<DarkStore> darkStores, User user);
}
