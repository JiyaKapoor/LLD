package com.example.demo.LoggingFramework;

public class Logger {
    public static void main(String[] args){
        LogObserver consoleObserver=new ConsoleLogObserver();
        LogObserver fileObserver=new FileLogObserver();
        //COR chain
        LogHandler infoLogHandler=new InfoLogHandler();
        LogHandler debugLogHandler=new DebugLogHandler();
        infoLogHandler.setNext(debugLogHandler);

        infoLogHandler.addObserver(consoleObserver);
        debugLogHandler.addObserver(consoleObserver);
        debugLogHandler.addObserver(fileObserver);

        infoLogHandler.log(LogType.INFO,"User abc signed in");
        infoLogHandler.log(LogType.DEBUG,"No record found in DB");
    }
}
