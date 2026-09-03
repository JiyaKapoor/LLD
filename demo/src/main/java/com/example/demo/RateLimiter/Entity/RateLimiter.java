package com.example.demo.RateLimiter.Entity;

public interface RateLimiter {
    public boolean allowRequest(Long userId);
}
