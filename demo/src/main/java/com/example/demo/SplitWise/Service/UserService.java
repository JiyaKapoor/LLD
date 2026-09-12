package com.example.demo.SplitWise.Service;

import com.example.demo.SplitWise.Entity.Group;
import com.example.demo.SplitWise.Entity.User;

import java.util.Map;

public class UserService {
    public void addUserToGroup(User user, Group group){
        group.getParticipants().add(user);
    }
    public boolean removeUser(User user,Group group){
        //this user can only leave if they have settled all the expenses
        Map<User,Double> moneyOwed=group.getBalanceMap().get(user);
        if(moneyOwed.isEmpty()){
            group.getParticipants().remove(user);
            return true;
        }
        return false;
    }
}
