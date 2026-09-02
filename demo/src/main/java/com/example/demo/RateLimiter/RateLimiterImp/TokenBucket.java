package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Service.RateLimiterService;

import java.util.HashMap;

public class TokenBucket implements RateLimiter {
    //basically every user will be allotted a fixed number of tokens
    HashMap<String,Integer> avalTokens=new HashMap<>();
    HashMap<String,Long> refillTime=new HashMap<>();
    //for this algo
    public boolean allowRequest(User user){

    }

}
