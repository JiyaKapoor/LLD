package com.example.demo.TicTacToe;

import java.util.Arrays;

public class Board {
    char[][] grid;
    public Board(){
        grid=new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]='_';
            }
        }
    }
    public boolean isEmpty(int r,int c){
        return this.grid[r][c]=='_';
    }
    public void markCell(int r,int c,char symbol){
        grid[r][c]=symbol;
    }
}
