package com.example.demo.ATM;

public class ATM {
    ATMState currState;
    public void setState(ATMState atmState){
        this.currState=atmState;
    }
}
