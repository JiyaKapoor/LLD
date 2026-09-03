package com.example.demo.RateLimiter.RateLimiterImp;


import com.example.demo.RateLimiter.Entity.Pair;
import com.example.demo.RateLimiter.Entity.User;

import java.util.HashMap;

public class FixedWindow {
    private Long windowSize;//(in sec)
    private int maxRequest;//in one discrete window
    HashMap<Long, Pair> userReq=new HashMap<>();
    // [1:[windowStartTime,count]]
    public boolean allowRequest(User user){
        if(userReq.containsKey(user.getUserId())){
            Pair p=userReq.get(user.getUserId());
            Long windowStart=p.windowStart;
            int reqCnt=p.reqCnt;
            if((System.currentTimeMillis()-windowStart)/1000>windowSize){
                //we need to refill the tokens
                userReq.put(user.getUserId(),new Pair(System.currentTimeMillis(),1));
                return true;
            }
            else{
                if(reqCnt==maxRequest){
                    return false;
                }
                userReq.put(user.getUserId(),new Pair(windowStart,reqCnt+1));
                return true;
            }
        }
        //the user doesnot yet have a nentry in the map this is the first req from the user side
        userReq.put(user.getUserId(),new Pair(System.currentTimeMillis(),1));
        return true;
    }
}

