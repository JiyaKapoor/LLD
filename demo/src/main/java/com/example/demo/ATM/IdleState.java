package com.example.demo.ATM;

public class IdleState implements ATMState{

    @Override
    public void insertCard(ATM atm) {
        atm.setState(new hasCardState());
    }
    @Override
    public void enterPIN(ATM atm,Card card,int PIN){

    }
    @Override
    public void balanceInquiry(ATM atm, Card card) {
        System.out.println("Please Insert Card first");
    }

    @Override
    public void withdrawCash(ATM atm, Card card,double amount) {

    }

    @Override
    public void depositCash(ATM atm, Card card) {

    }
    @Override
    public void ejectCard(ATM atm){

    }
}
