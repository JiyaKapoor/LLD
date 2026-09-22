package com.example.demo.LoggingFramework;

public class InfoLogHandler extends LogHandler{

    @Override
    boolean canHandle(LogType logType) {
        if(logType==LogType.INFO){
            return true;
        }
        return false;
    }

}
