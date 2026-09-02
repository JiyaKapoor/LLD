package com.example.demo.RateLimiter.Entity;

public class User {
    private String userId;
    private UserTier tier;
    public String getUserId(){
        return this.userId;
    }
    public UserTier getTier(){
        return this.tier;
    }
}
