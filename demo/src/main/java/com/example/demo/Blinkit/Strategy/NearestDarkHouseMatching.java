package com.example.demo.Blinkit.Strategy;

import com.example.demo.Blinkit.Entity.DarkStore;
import com.example.demo.Blinkit.Entity.Product;
import com.example.demo.Blinkit.Entity.User;

import java.util.List;
import java.util.Map;

public class NearestDarkHouseMatching implements DarkStoreMatchingStrategy{
    public DarkStore findBestDarkStore(Map<Product,Integer> cartItems, List<DarkStore> avalDarkStores, User user){
        double minDist=Double.MAX_VALUE;
        DarkStore bestDarkStore=null;
        for(DarkStore ds:avalDarkStores){
            if(ds.getInventoryManager().canSatisfy(cartItems) && user.getLoc().getDist(ds.getLoc())<minDist){
                minDist=user.getLoc().getDist(ds.getLoc());
                bestDarkStore=ds;
            }
        }
        return bestDarkStore;
    }
}
