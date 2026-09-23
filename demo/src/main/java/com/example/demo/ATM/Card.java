package com.example.demo.ATM;

public class Card {
    String cardNumber;
    String cardHolderName;
    int PIN;
    double balance;
    public boolean authenticate(int enteredPIN){
        return this.PIN==enteredPIN;
    }
    public double getBalance(){
        return this.balance;
    }
}
