package com.example.demo.ATM;

public abstract class CashWithdrawalManager {
    CashWithdrawalManager next;
    public void setNext(CashWithdrawalManager next){
        this.next=next;
    }
    public abstract void dispense(double amount);


}
