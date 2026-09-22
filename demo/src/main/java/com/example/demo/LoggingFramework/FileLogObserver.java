package com.example.demo.LoggingFramework;

public class FileLogObserver implements LogObserver{
    public void update(String message){
        System.out.println("Writing to app.log: "+ message);
    }
}
