package com.example.demo.SplitWise.Entity;

import java.util.HashMap;
import java.util.List;

public class Group{
    String groupId;
    List<User> users;
    String groupName;
    HashMap<String,HashMap<String,Double>> balance;
    public void addUser(User user){
        this.users.add(user);
    }
    public boolean removeUser(User user){
        //this user can only leave if they have settled all the expenses
        HashMap<String,Double> moneyOwed=balance.get(user.userId);
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
