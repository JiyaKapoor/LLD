package com.example.demo.ATM;

public class Card {
    String cardNumber;
    String cardHolderName;
    int PIN;
    double balance;
    public Card(String cardNumber,String cardHolderName,int PIN){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.PIN=PIN;
    }
    public boolean authenticate(int enteredPIN){
        return this.PIN==enteredPIN;
    }
    public double getBalance(){
        return this.balance;
    }
}
