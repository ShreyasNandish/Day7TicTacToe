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

    //public static void updateBoard(int position, int player,board) {
       public static char chooseLetter() {
           char character;
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the character you want to choose :");
           character = sc.next().charAt(0);
           return character;
       }

       static char computerCharacter() {
           char character = chooseLetter();
           if (character == 'x' || character == 'X') {
               return 'O';
           } else {
               return 'X';
           }
       }




    public static void main(String[] args) {
        createBoard(board);
        showBoard(board);
        char character=chooseLetter();
        System.out.println(character);
        char symbol=computerCharacter();
        System.out.println("The user selected symbol is :"+character);
        System.out.println("The computer selected symbol is :"+symbol);

    }

}
