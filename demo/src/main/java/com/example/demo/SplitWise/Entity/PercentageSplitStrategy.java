package com.example.demo.SplitWise.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PercentageSplitStrategy implements SplitStrategy {
    @Override
    public Map<User,Double> calculateSplit(double amount, User payer,List<User> participants,Map<User,Double> shares){
        //validation steps to be added to ensure that the sum of shares=100
        Map<User,Double> oweMap=new HashMap<>();
        for(User user:participants){
            if(user.equals(payer)){
                continue;
            }
            double amtOwed=amount*(shares.get(user))/100;
            oweMap.put(user,amtOwed);
        }
        return oweMap;
    }
}
