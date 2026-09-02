package com.example.demo.RateLimiter.Entity;

public class User {
    private Long userId;
    private UserTier tier;
    public Long getUserId(){
        return this.userId;
    }
    public UserTier getTier(){
        return this.tier;
    }
}
