package com.example.demo.ATM;

public class FiveHundredHandler extends CashWithdrawalManager{
    int numNotes;
    public FiveHundredHandler(int numNotes){
        this.numNotes=numNotes;
    }
    @Override
    public void dispense(double amount) {
        int notesReq=(int)(amount/500.0);
        int notesTobeDispensed=Math.min(numNotes,notesReq);
        System.out.println("Dispensing "+notesTobeDispensed+" five hundred notes");
        double remainingAmt=amount-notesTobeDispensed*500;
        if(remainingAmt>0){
            this.next.dispense(remainingAmt);//forwarding the req down the chain
        }
    }
}
