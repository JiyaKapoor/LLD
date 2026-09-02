package com.example.demo.RateLimiter.RateLimiterImp;

import java.util.HashMap;

public class TokenBucket {
    //basically every user will be allotted a fixed number of tokens
    HashMap<String,Integer> avalTokens=new HashMap<>();
    HashMap<String,Long> refillTime=new HashMap<>();
}
