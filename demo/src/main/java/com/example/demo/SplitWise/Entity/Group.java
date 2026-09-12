package com.example.demo.SplitWise.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group{
    String groupId;
    List<User> users;
    String groupName;
    Map<User,Map<User,Double>> balance;
    List<Observer> observers;
    public void notifyObservers(){
        //as soon as any expense is added to the group all the observers i.e the group memebrs must be notified
        for(Observer obs:observers){
            obs.onUpdate(this);
        }
    }
    public Map<User, Map<User,Double>> getBalanceMap(){
        return this.balance;
    }
    public void addUser(User user){
        this.users.add(user);
    }
    public boolean removeUser(User user){
        //this user can only leave if they have settled all the expenses
        Map<User,Double> moneyOwed=balance.get(user);
        if(moneyOwed.isEmpty()){
            users.remove(user);
            return true;
        }
        return false;
    }
    public void settlePayment(User userFrom,User userTo,double amt){
        //money flows from userFrom--->userTo
        //there are two cases
        //one is of settling a debt
        //other is that another debt is getting added

    }
}
