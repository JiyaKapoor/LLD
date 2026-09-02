package com.example.demo.RateLimiter.RateLimiterImp;

import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;

import java.util.Deque;
import java.util.HashMap;

public class SlidingWindow implements RateLimiter {
    //in this algorithm we basically need to maintain a sliding window which keeps track of the requests made uptill n milisec ago
    private int maxRequests;
    private Long windowSize;
    private HashMap<Long, Deque<Long>> requestLog=new HashMap<>();
    public boolean allowRequest(User user){
        //we need to first evict the requests that were made outside of the current window
        Deque<Long> userRequestLog=requestLog.get(user.getUserId());
        while(userRequestLog.peekFirst()<System.currentTimeMillis()-windowSize){
            //we need to evict the request kept at the peek of the array deque
            userRequestLog.pollFirst();
        }
        //now once we have evicted all the expired req, we need to check the number of req in the current window
        int currRequests=userRequestLog.size();
        if(currRequests==maxRequests){
            return false;
        }
        userRequestLog.offerLast(System.currentTimeMillis());
        return true;// we also need to add the entry of this request to the arra ydeque
    }

}
