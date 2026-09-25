package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.DarkStore;
import com.example.demo.Blinkit.Entity.Product;
import com.example.demo.Blinkit.Entity.User;
import com.example.demo.Blinkit.Strategy.DarkStoreMatchingStrategy;
import com.example.demo.Blinkit.Strategy.NearestDarkHouseMatching;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DarkStoreService {
    @Autowired
    DarkStoreMatchingStrategy darkStoreMatchingStrategy;
    public DarkStoreService(){
        this.darkStoreMatchingStrategy=new NearestDarkHouseMatching();
    }
    final List<DarkStore> darkStores=new ArrayList<>();
    public void addDarkStore(DarkStore darkStore){
        darkStores.add(darkStore);
    }
    public DarkStore findBestDarkStore(Map<Product, Integer> cartItems, User user) {
        return darkStoreMatchingStrategy.findBestDarkStore(cartItems,darkStores,user);
    }
}
