package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Service.RateLimiterService;

import java.util.HashMap;

public class TokenBucket implements RateLimiter {
    //basically every user will be allotted a fixed number of tokens
    HashMap<String,Integer> avalTokens=new HashMap<>();
    HashMap<String,Long> refillTime=new HashMap<>();
    private int maxTokens;
    private Long refillRate;
    //for this algo we need to know the refill rate and the max token in any bucket
    public TokenBucket(int maxToken,Long refillRate){
        this.maxTokens=maxToken;
        this.refillRate=refillRate;
    }
    public boolean allowRequest(User user){

    }

}
