package com.example.demo.TicTacToe;

public interface Rule {
    public boolean checkWin(Board board);
    public boolean checkDraw(Board board);
}
