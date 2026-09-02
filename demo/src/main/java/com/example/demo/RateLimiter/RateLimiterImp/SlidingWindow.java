package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;

import java.util.Deque;
import java.util.HashMap;

public class SlidingWindow implements RateLimiter {
    //in this algorithm we basically needc to maintain a sliding window which keeps track of the requests made uptill n milisec ago
    private int maxRequests;
    private Long windowSize;
    private HashMap<Long, Deque<Long>> requestLog=new HashMap<>();
    public boolean allowRequest(User user){

    }

}
