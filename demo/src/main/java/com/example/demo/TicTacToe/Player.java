package com.example.demo.TicTacToe;

public class Player {
    String playerId;
    String playerName;
    char symbol;//This represents the symbol with which the player is playing
    public Player(String playerName,char Symbol){
        this.playerName=playerName;
        this.symbol=Symbol;
    }
    public char getSymbol(){
        return this.symbol;
    }
    public String getPlayerName(){
        return this.playerName;
    }
}
