package com.example.demo.LoggingFramework;

public class Logger {
    public static void main(String[] args){
        LogHandler infoLogHandler=new InfoLogHandler();
        LogHandler debugLogHandler=new DebugLogHandler();
        infoLogHandler.setNext(debugLogHandler);
        infoLogHandler.log(LogType.INFO,"User abc signed in");
        infoLogHandler.log(LogType.DEBUG,"No record found in DB");
    }
}
