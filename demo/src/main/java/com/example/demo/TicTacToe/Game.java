package com.example.demo.TicTacToe;
import java.util.*;
public class Game {
    Board board;
    Rule rule;
    Player playerA;
    Player playerB;//can use a deque if more than two players allowed
    boolean gameOver;
    boolean flag;
    public void play(){
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            char playerSymbol;
            Player currPlayer;
            if(flag){
                //Player 1 turn
                System.out.println(playerA.getPlayerName()+" enter row and col: ");
                playerSymbol=playerA.getSymbol();
                currPlayer=playerA;
            }
            else{
                System.out.println(playerB.getPlayerName()+" enter row and col: ");
                playerSymbol=playerB.getSymbol();
                currPlayer=playerB;
            }
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(!board.isEmpty(row,col)){
                System.out.println("Cell already occupied");
                continue;
            }
            board.markCell(row,col,playerSymbol);
            if(rule.checkWin(board)){
                System.out.println(currPlayer.getPlayerName()+" Won the match!");
                gameOver=true;
            }
            else if(rule.checkDraw(board)){
                System.out.println("Match drawn");
                gameOver=true;
            }
            flag= flag ?false:true;
        }

    }
}
