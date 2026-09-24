package com.example.demo.Blinkit.Entity;

public class DarkStore {
    String darkStoreId;
    Location location;
    InventoryManager inventoryManager;

    public InventoryManager getInventoryManager() {
        return this.inventoryManager;
    }
    public Location getLoc(){
        return this.location;
    }
}
