package com.example.demo.RateLimiter.Entity;

public class Pair {
    public Long windowStart;
    public int reqCnt;
    public Pair(Long windowStart,int reqCnt){
        this.windowStart=windowStart;
        this.reqCnt=reqCnt;
    }

}
