package com.example.demo.ATM;

public class ATM {
    ATMState currState;
    CashWithdrawalManager cashWithdrawalManager;
    public ATM(){
        this.currState=new IdleState();

    }
    public void setState(ATMState atmState){
        this.currState=atmState;
    }
}
