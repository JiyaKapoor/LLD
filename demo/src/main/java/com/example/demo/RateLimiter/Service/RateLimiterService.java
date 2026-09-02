package com.example.demo.RateLimiter.Service;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Entity.UserTier;
import com.example.demo.RateLimiter.RateLimiterImp.SlidingWindow;
import com.example.demo.RateLimiter.RateLimiterImp.TokenBucket;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {
    Map<UserTier, RateLimiter> registry=new HashMap<>();
    public RateLimiterService(){
        //we initialise the registry
        registry.put(UserTier.FREE,new TokenBucket());
        registry.put(UserTier.PREMIUM,new SlidingWindow());
    }
    public boolean allowRequest(User user){
        // we first find out the limiter to which we need to route this request to
        RateLimiter limiter=registry.get(user.getTier());
        limiter.allowRequest(user);
    }
}
