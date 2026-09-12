package com.example.demo.SplitWise.Entity;

import java.util.List;

public class User implements Observer{
    String userId;
    String name;
    List<Group> groups;
    @Override
    public void onUpdate(Group group){
        System.out.print("New expense added to group:" + group.groupName);
    }
}
