package com.example.demo.SplitWise.Entity;

import java.util.List;
import java.util.Map;

public class EqualSplitStrategy implements SplitStrategy{
    //this overrides the calculate split method
    @Override
    public Map<User,Double> calculateSplit(double amount, List<User> participants,Map<User,Double> shares){
        //the third arg will be null for the EqualSplitStrategy object

    }

}
