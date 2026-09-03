package com.example.demo.RateLimiter.Service;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Entity.UserTier;
import com.example.demo.RateLimiter.RateLimiterImp.SlidingWindow;
import com.example.demo.RateLimiter.RateLimiterImp.TokenBucket;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class RateLimiterService {
    Map<UserTier, RateLimiter> registry=new HashMap<>();
    public RateLimiterService(){
        //we initialise the registry
        registry.put(UserTier.FREE,new TokenBucket(10,4L));
        registry.put(UserTier.PREMIUM,new SlidingWindow());
    }
    public boolean allowRequest(Long userId,UserTier userTier){
        // we first find out the limiter to which we need to route this request to
        RateLimiter limiter=registry.get(userTier);
        return limiter.allowRequest(userId);
    }
}
