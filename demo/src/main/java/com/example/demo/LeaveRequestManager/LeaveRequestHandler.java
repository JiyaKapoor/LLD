package com.example.demo.LeaveRequestManager;

public abstract class LeaveRequestHandler {
    LeaveRequestHandler next;
    public void setNext(LeaveRequestHandler next){
        this.next=next;
    }
    public abstract void handleLeaveRequest(int numDays);
    public abstract boolean canHandle(int numDays);
}
