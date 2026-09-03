package com.example.demo.RateLimiter.RateLimiterImp;


import com.example.demo.RateLimiter.Entity.Pair;
import com.example.demo.RateLimiter.Entity.RateLimiter;
import com.example.demo.RateLimiter.Entity.User;
import java.util.HashMap;
public class FixedWindow implements RateLimiter {
    private Long windowSize=60L;//(in sec)
    private int maxRequest=6;//in one discrete window
    HashMap<Long, Pair> userReq=new HashMap<>();
    // [1:[windowStartTime,count]]
    public boolean allowRequest(Long userId){
        if(userReq.containsKey(userId)){
            Pair p=userReq.get(userId);
            Long windowStart=p.windowStart;
            int reqCnt=p.reqCnt;
            if((System.currentTimeMillis()-windowStart)/1000>windowSize){
                //we need to refill the tokens
                userReq.put(userId,new Pair(System.currentTimeMillis(),1));
                return true;
            }
            else{
                if(reqCnt==maxRequest){
                    return false;
                }
                userReq.put(userId,new Pair(windowStart,reqCnt+1));
                return true;
            }
        }
        //the user doesnot yet have a nentry in the map this is the first req from the user side
        userReq.put(userId,new Pair(System.currentTimeMillis(),1));
        return true;
    }
}

