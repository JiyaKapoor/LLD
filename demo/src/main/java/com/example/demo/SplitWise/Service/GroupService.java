package com.example.demo.SplitWise.Service;

import com.example.demo.SplitWise.Entity.BalancePair;
import com.example.demo.SplitWise.Entity.Group;
import com.example.demo.SplitWise.Entity.Transaction;
import com.example.demo.SplitWise.Entity.User;

import java.util.*;

public class GroupService {
    public List<Transaction> settleDebt(Group group){
        //the aim of this function is to return minimal transactions required to settle the debt in any group
        //we use a greedy two pointer approach where in we match the person with highest debt to the person with highest credit
        List<Transaction> transactionsReq=new ArrayList<>();
        Map<User,Map<User,Double>> balanceMap=group.getBalanceMap();
        Map<User,Double> netBalance=new HashMap<>();
        for(User debitor:balanceMap.keySet()){
            Map<User,Double> debtMap=balanceMap.get(debitor);
            for(User creditor:debtMap.keySet()){
                double amt=debtMap.get(creditor);
                netBalance.put(debitor, netBalance.getOrDefault(debitor,0.0)-amt);
                netBalance.put(creditor, netBalance.getOrDefault(creditor,0.0)+amt);
            }
        }
        List<BalancePair> creditors=new ArrayList<>();
        List<BalancePair> debitors=new ArrayList<>();
        //now we need to separate creditors and debitors
        for(User user: netBalance.keySet()){
            if(netBalance.get(user)==0){
                continue;
            }
            else if(netBalance.get(user)>0){
                creditors.add(new BalancePair(user,netBalance.get(user)));
            }
            else{
                debitors.add(new BalancePair(user, netBalance.get(user)));
            }
        }
        Collections.sort(creditors,(a,b)->Double.compare(a.netBalance,b.netBalance));
        Collections.sort(debitors,(a,b)->Double.compare(b.netBalance,a.netBalance));
        int i=0;
        int j=0;
        while(i<creditors.size() && j<debitors.size()){
            //we are trying to match the largest creditor with the largest debitor
            double amtToSettle=Math.min(Math.abs(debitors.get(i).netBalance),creditors.get(j).netBalance);
            creditors.get(j).netBalance-=amtToSettle;
            debitors.get(i).netBalance+=amtToSettle;
            //we create a new Transaction object
            transactionsReq.add(new Transaction(debitors.get(i).user,creditors.get(j).user,amtToSettle));
            if(creditors.get(j).netBalance-amtToSettle==0.0){
                j++;//the current creditor is done
            }
            if(debitors.get(i).netBalance+amtToSettle==0.0){
                i++;
            }
        }
        return transactionsReq;
    }
}
