package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Service.RateLimiterService;

import java.util.HashMap;

public class TokenBucket implements RateLimiterService {
    //basically every user will be allotted a fixed number of tokens
    HashMap<String,Integer> avalTokens=new HashMap<>();
    HashMap<String,Long> refillTime=new HashMap<>();
    public boolean isAllowed(String user){

    }
}
