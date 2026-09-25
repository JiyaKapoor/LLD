package com.example.demo.Blinkit.Service;

import com.example.demo.Blinkit.Entity.Cart;
import com.example.demo.Blinkit.Entity.Product;
import com.example.demo.Blinkit.Entity.User;

import java.util.HashMap;
import java.util.Map;

public class CartService {
    final Map<User, Cart> carts=new HashMap<>();
    //This service becomes imp when it serves as an orchestration layer
    //In our system--an item can only be added only if it can be fulfilled by a nearby DarkHouse
    public void addToCart(User user,Product product,int qty){
        if(carts.containsKey(user)){
            Cart userCart=carts.get(user);
            userCart.addItem(product,qty);
        }
        else{
            Cart newCart=new Cart("CART: "+carts.size(),user,new HashMap<>());
            newCart.addItem(product,qty);
            carts.put(user,newCart);
        }
    }
    public Cart getUserCart(User user){
        return carts.get(user);
    }

}
