package com.example.demo.LoggingFramework;

public class DebugLogHandler extends LogHandler{
    @Override
    boolean canHandle(LogType logType) {
        return logType==LogType.DEBUG;
    }

    @Override
    void handle(String message) {
        System.out.println("[DEBUG]"+message);
    }
}
