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
        //VALIDATION STEP 1:
        if(card.getBalance()<amount){
            System.out.println(card.getBalance());
            System.out.println("Insufficient Account Balance");
        }
        else{
            atm.cashWithdrawalManager.dispense(amount);
            ejectCard(atm);
            atm.setState(new IdleState());
        }
    }

    @Override
    public void ejectCard(ATM atm){
        System.out.println("Please collect your card");
    }
}
