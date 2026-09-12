package com.example.demo.SplitWise.Factory;

import com.example.demo.SplitWise.Entity.EqualSplitStrategy;
import com.example.demo.SplitWise.Entity.PercentageSplitStrategy;
import com.example.demo.SplitWise.Entity.SplitStrategy;
import com.example.demo.SplitWise.Entity.SplitType;

public class SplitStrategyFactory {
    public SplitStrategy createSplit(SplitType splitType){
        if(splitType==SplitType.EQUAL){
            return new EqualSplitStrategy();
        }
        else if(splitType==SplitType.PERCENTAGE){
            return new PercentageSplitStrategy();
        }
        return null;//no valid splitStrategy entered
    }
}
