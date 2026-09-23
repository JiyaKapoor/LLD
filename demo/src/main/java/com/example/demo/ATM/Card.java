package com.example.demo.ATM;

public class Card {
    String cardNumber;
    String cardHolderName;
    int PIN;
    double balance;
    public Card(String cardNumber,String cardHolderName,int PIN,double balance){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.PIN=PIN;
        this.balance=balance;
    }
    public boolean authenticate(int enteredPIN){
        return this.PIN==enteredPIN;
    }
    public double getBalance(){
        return this.balance;
    }
}
