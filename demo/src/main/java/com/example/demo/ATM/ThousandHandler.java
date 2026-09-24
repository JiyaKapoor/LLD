package com.example.demo.ATM;

public class ThousandHandler extends CashWithdrawalManager{
    int numNotes;
    public ThousandHandler(int numNotes){
        this.numNotes=numNotes;
    }
    @Override
    public void dispense(double amount){
        int notesReq=(int)(amount/1000.0);
        int notesTobeDispensed=Math.min(numNotes,notesReq);
        System.out.println("Dispensing "+notesTobeDispensed+" thousand notes");
        double remainingAmt=amount-notesTobeDispensed*1000;
        this.numNotes-=notesTobeDispensed;
        if(remainingAmt>0){
            if(this.next!=null)this.next.dispense(remainingAmt);//forwarding the req down the chain
            else System.out.println("Not Enough money in the ATM to be dispensed");
        }
    }
}
