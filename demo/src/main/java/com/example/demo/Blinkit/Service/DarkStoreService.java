package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.DarkStore;

import java.util.ArrayList;
import java.util.List;

public class DarkStoreService {
    final List<DarkStore> darkStores=new ArrayList<>();
    public void addDarkStore(DarkStore darkStore){
        darkStores.add(darkStore);
    }
    public void fetchInventory(){

    }

}
