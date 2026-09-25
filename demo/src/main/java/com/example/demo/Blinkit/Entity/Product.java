package com.example.demo.Blinkit.Entity;

import java.util.Objects;

public class Product {
    int sku;
    String prodName;
    double price;
    public Product(int sku,String prodName,double price){
        this.sku=sku;
        this.prodName=prodName;
        this.price=price;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof Product product)) return false;
        return sku==product.sku;
    }
    @Override
    public int hashCode(){
        return Objects.hash(sku);
    }
}
