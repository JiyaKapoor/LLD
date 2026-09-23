package com.example.demo.ATM;

public class ATM {
    ATMState currState;
    CashWithdrawalManager cashWithdrawalManager;
    public ATM(){
        this.currState=new IdleState();
        CashWithdrawalManager thousandHandler=new ThousandHandler(10);
        CashWithdrawalManager fiveHundredHandler=new FiveHundredHandler(50);
        thousandHandler.setNext(fiveHundredHandler);//chain formed
    }
    public void setState(ATMState atmState){
        this.currState=atmState;
    }
    //defining all the calls that can be made on the ATM
    public void insertCard(Card card){
        currState.insertCard(this);
    }
    public void enterPIN(Card card,int PIN){
        currState.enterPIN(this,card,PIN);
    }
    public void withdrawCash(Card card,double amt){
        currState.withdrawCash(this,card,amt);
    }
}
