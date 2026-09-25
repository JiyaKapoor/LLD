package com.example.demo.TicTacToe;

import java.util.Scanner;

public class GameController {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Player jiya=new Player("Jiya",'X');
        Player kabir=new Player("Kabir",'O');
        Game game=new Game(jiya,kabir);
        game.play();
    }
}
