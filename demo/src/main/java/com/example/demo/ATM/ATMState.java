package com.example.demo.ATM;

public interface ATMState {
    public void insertCard(ATM atm);
    public void enterPIN(ATM atm,Card card,int PIN);
    public void balanceInquiry(ATM atm,Card card);
    public void withdrawCash(ATM atm,Card card,double amount);
    public void depositCash(ATM atm,Card card);
}
