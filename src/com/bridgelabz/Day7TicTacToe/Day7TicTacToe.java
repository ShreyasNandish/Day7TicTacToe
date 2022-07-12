package com.bridgelabz.Day7TicTacToe;

import java.util.Scanner;

public class Day7TicTacToe {

    static char[] board=new char[10];
    static void createBoard(char[] board)
    {
        for (int i=1;i<board.length;i++)
        {
            board[i]='-';
        }
    }
    static void showBoard(char[] board)
    {
        for (int i=1;i<board.length;i++)
        {
            System.out.print(board[i]);
            System.out.print(' ');
            if(i%3==0){
                System.out.println();
            }

        }
    }


    public static void main(String[] args) {
        createBoard(board);
        showBoard(board);

    }

}
