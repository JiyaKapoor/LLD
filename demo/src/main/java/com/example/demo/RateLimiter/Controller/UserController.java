package com.example.demo.RateLimiter.Controller;

import com.example.demo.RateLimiter.Entity.UserTier;
import com.example.demo.RateLimiter.Service.RateLimiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private RateLimiterService rateLimiterService;
    @PostMapping
    public void registerUser(UserTier userTier){

    }
}
