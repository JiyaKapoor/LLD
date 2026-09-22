package com.example.demo.LeaveRequestManager;

public class TeamLead extends LeaveRequestHandler{
    @Override
    public void handleLeaveRequest(int numDays){
        if(canHandle(numDays)){
            System.out.println("Leave approved by team lead");
        }
        else{
            next.handleLeaveRequest(numDays);
        }
    }
    @Override
    public boolean canHandle(int numDays){
        return numDays<=3;
    }
}
