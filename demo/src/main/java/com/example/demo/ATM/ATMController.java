package com.example.demo.ATM;

public class ATMController {
    public static void main(String[] args){
        ATM atm=new ATM();
        Card userACard=new Card("AXRY123","JIYA",10841,3500);
        atm.insertCard(userACard);
        atm.enterPIN(userACard,10841);
        atm.withdrawCash(userACard,1500);
    }
}
