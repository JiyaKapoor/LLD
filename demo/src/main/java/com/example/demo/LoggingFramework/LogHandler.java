package com.example.demo.LoggingFramework;

public abstract class LogHandler {
    protected LogHandler next;
    //It is good OOP practice to keep the repetitive code in the abtract class itself
    public void setNext(LogHandler next){
        this.next=next;
    }
    public void log(LogType logType,String message){
        if(canHandle(logType)){
            handle(message);
        }
        else if(next!=null){
            //this handler cannot handle pass it down the chain
            next.log(logType, message);
        }
    }
    abstract boolean canHandle(LogType logType);
    abstract void handle(String message);
}
