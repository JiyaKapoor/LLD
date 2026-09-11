package com.example.demo.SplitWise.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy{
    //this overrides the calculate split method
    @Override
    public Map<User,Double> calculateSplit(double amount, User payer,List<User> participants,Map<User,Double> shares){
        //the third arg will be null for the EqualSplitStrategy object
        Map<User,Double> oweMap=new HashMap<>();
        int totalParticipants=participants.size();
        for(User user:participants){
            if(user.equals(payer)){
                continue;
            }
            double amtOwed=amount/totalParticipants;
            oweMap.put(user,amtOwed);
        }
        return oweMap;
    }

}
