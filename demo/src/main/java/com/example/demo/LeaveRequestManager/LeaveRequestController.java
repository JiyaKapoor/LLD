package com.example.demo.LeaveRequestManager;

public class LeaveRequestController {
    public static void main(String[] args){
        LeaveRequestHandler teamLead=new TeamLead();
        LeaveRequestHandler projectManager=new ProjectManager();
        teamLead.setNext(projectManager);

        teamLead.handleLeaveRequest(4);
    }
}
