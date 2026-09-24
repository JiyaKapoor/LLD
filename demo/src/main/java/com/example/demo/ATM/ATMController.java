package com.example.demo.ATM;

public class ATMController {
    public static void main(String[] args){
        ATM atm=new ATM();
        Card userACard=new Card("AXRY123","JIYA",10841,3500);
        Card userBCard=new Card("AZRY123","KABIR",10841,20000);
        Card userCCard=new Card("ASRY123","PRIYA",10841,50000);
        atm.insertCard(userCCard);
        atm.enterPIN(userCCard,10841);
        atm.withdrawCash(userCCard,40000);
    }
}
