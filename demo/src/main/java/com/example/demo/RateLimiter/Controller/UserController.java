package com.example.demo.RateLimiter.Controller;

import com.example.demo.RateLimiter.Entity.User;
import com.example.demo.RateLimiter.Entity.UserTier;
import com.example.demo.RateLimiter.Service.RateLimiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private RateLimiterService rateLimiterService;
    @GetMapping
    public ResponseEntity<String> userRequest(Long userId, UserTier userTier){
        boolean res=rateLimiterService.allowRequest(userId,userTier);
        if(res){
            return ResponseEntity.ok("Request Reached Server");
        }
        return ResponseEntity.ok("Reqest Rate Limited, Try sometime later!");
    }
}
