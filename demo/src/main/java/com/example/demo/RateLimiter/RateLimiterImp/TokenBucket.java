package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Service.RateLimiterService;

import java.util.HashMap;

public class TokenBucket implements RateLimiter {
    //basically every user will be allotted a fixed number of tokens
    HashMap<Long,Long> avalTokens=new HashMap<>();
    HashMap<Long,Long> refillTime=new HashMap<>();
    private int maxTokens=6;
    private Long refillRate=1L;//this tells us the number of tokens added per sec
    //for this algo we need to know the refill rate and the max token in any bucket
    public TokenBucket(int maxToken,Long refillRate){
        this.maxTokens=maxToken;
        this.refillRate=refillRate;
    }
    public boolean allowRequest(Long userId){
        //for this user we first need to check if there are any aval token left
        Long lastRefill=refillTime.get(userId);
        Long secElapsed=(System.currentTimeMillis()-lastRefill)/1000;
        Long currentTokens=Math.min(maxTokens,secElapsed*refillRate+avalTokens.get(userId));
        if(currentTokens<=0){
            return false;
        }
        refillTime.put(userId,System.currentTimeMillis());
        avalTokens.put(userId,currentTokens);
        return true;
    }

}
