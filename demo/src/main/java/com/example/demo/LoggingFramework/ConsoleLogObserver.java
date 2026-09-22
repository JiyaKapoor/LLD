package com.example.demo.LoggingFramework;

public class ConsoleLogObserver implements LogObserver{
    public void update(String message){
        System.out.println("[CONSOLE]"+message);
    }
}
