package com.example.demo.SplitWise.Service;

import com.example.demo.FoodDeliverySystem.Entity.User;
import com.example.demo.SplitWise.Entity.Expense;
import com.example.demo.SplitWise.Entity.Group;
import com.example.demo.SplitWise.Entity.SplitStrategy;
import com.example.demo.SplitWise.Entity.SplitType;
import com.example.demo.SplitWise.Factory.SplitStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ExpenseService {
    @Autowired
    SplitStrategyFactory splitStrategyFactory;
    List<Expense> expenses;
    public void addExpense(Group group, User payer, double amount, SplitType splitType){
        //STEP 1: create the appropriate SplitStrategy object using the function parameters
        SplitStrategy splitStrategy=splitStrategyFactory.createSplit(splitType);
        // Now if we have an equal split in the function param-> equalsplitStrategy instance created

    }
}
