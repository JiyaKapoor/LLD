package com.example.demo.TicTacToe;

public class StandardRule implements Rule{
    //It checks row wise col wise and two diagonals
    @Override
    public boolean checkWin(Board board){
        //Checking Horizontally
        for(int i=0;i<3;i++){
            boolean rowWin=true;
            char initChar=board.grid[i][0];
            for(int j=1;j<3;j++){
                if(board.grid[i][j]!=initChar){
                    rowWin=false;
                    break;
                }
                if(rowWin)return true;
            }
        }
        //checking vertically
        for(int j=0;j<3;j++){
            boolean colWin=true;
            char initChar=board.grid[0][j];
            for(int i=1;i<3;i++){
                if(board.grid[i][j]!=initChar){
                    colWin=false;
                    break;
                }
                if(colWin)return true;
            }
        }
        //checking diagonally(2 diagonals to check)
        int i=1;
        int j=1;
        char initChar=board.grid[0][0];
        boolean diagonalWin=true;
        while(i<3 && j<3){
            if(board.grid[i][j]!=initChar){
                diagonalWin=false;
                break;
            }
            i++;
            j++;
        }
        if(diagonalWin)return true;
        diagonalWin=true;
        i=2;
        j=0;
        initChar=board.grid[2][0];
        while(i>=0 && j<3){
            if(board.grid[i][j]!=initChar){
                diagonalWin=false;
                break;
            }
            i--;
            j++;
        }
        if(diagonalWin)return true;
        return false;
    }
    @Override
    public boolean checkDraw(Board board){
        return false;
    }

}
