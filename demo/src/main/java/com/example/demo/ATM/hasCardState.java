package com.example.demo.ATM;

public class hasCardState implements ATMState{
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card already inserted");
    }
    @Override
    public void enterPIN(ATM atm,Card card,int PIN){
        if(card.authenticate(PIN)){
            System.out.println("User authenticated Successfully!");
            atm.setState(new AuthenticatedState());
        }
        else{
            System.out.println("Invalid PIN entered!");
        }
    }
    @Override
    public void balanceInquiry(ATM atm, Card card) {
        System.out.println("User not authenticated yet");
    }

    @Override
    public void withdrawCash(ATM atm, Card card, double amount) {
        System.out.println("User not authenticated yet");
    }


    @Override
    public void ejectCard(ATM atm){
        System.out.print("Please collect your card");
    }
}
