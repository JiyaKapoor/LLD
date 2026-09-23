package com.example.demo.ATM;

public class AuthenticatedState implements ATMState{
    @Override
    public void insertCard(ATM atm) {

    }

    @Override
    public void enterPIN(ATM atm, Card card, int PIN) {

    }

    @Override
    public void balanceInquiry(ATM atm, Card card) {

    }

    @Override
    public void withdrawCash(ATM atm, Card card, double amount) {

    }

    @Override
    public void depositCash(ATM atm, Card card) {

    }
    @Override
    public void ejectCard(ATM atm){
        System.out.println("Please collect your card");
    }
}
