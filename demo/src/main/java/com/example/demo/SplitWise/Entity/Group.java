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
    List<Expense> expenses;
    public void notifyObservers(){
        //as soon as any expense is added to the group all the observers i.e the group memebrs must be notified
        for(Observer obs:observers){
            obs.onUpdate(this);
        }
    }
    public Map<User, Map<User,Double>> getBalanceMap(){
        return this.balance;
    }
    public List<User> getParticipants(){
        return this.users;
    }
    public void settlePayment(User userFrom,User userTo,double amt){


    }
}
