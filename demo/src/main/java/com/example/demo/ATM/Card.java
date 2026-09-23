package com.example.demo.ATM;

public class Card {
    String cardNumber;
    String cardHolderName;
    int PIN;
    public boolean authenticate(int enteredPIN){
        return this.PIN==enteredPIN;
    }
}
