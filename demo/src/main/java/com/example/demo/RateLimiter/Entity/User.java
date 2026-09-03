package com.example.demo.RateLimiter.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private UserTier tier;
    public Long getUserId(){
        return this.userId;
    }
    public UserTier getTier(){
        return this.tier;
    }
}
