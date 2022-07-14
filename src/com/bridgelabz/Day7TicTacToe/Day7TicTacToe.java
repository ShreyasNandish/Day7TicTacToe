package com.bridgelabz.Day7TicTacToe;

import java.util.Locale;
import java.util.Scanner;



public class Day7TicTacToe {
    static char computerCharacter;
    static char userCharacter;
    static int position;
    static final int userPlayer=1;
    static final int computer=2;

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


    public static void chooseLetter() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to choose :");
        userCharacter = sc.next().toUpperCase().charAt(0);
        computerCharacter=(userCharacter=='X')?'O':'X';

        System.out.println("The user selected letter is :"+userCharacter);
        System.out.println("The computer selected letter is :"+computerCharacter);
    }


    static void playerMove()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the position to which you have to move :");
        position=sc.nextInt();
        while(board[position]!='-')
        {
            System.out.println("Not a valid movie ");
            position=sc.nextInt();
        }
        updateBoard(position,board,userCharacter);
    }
    static void updateBoard(int position,char[] board,char userCharacter){

        userCharacter=doToss();
        switch (position){
            case 1:
                board[1]=userCharacter;
                showBoard(board);
                break;
            case 2:
                board[2]=userCharacter;
                showBoard(board);
                break;
            case 3:
                board[3]=userCharacter;
                showBoard(board);
                break;
            case 4:
                board[4]=userCharacter;
                showBoard(board);
                break;
            case 5:
                board[5]=userCharacter;
                showBoard(board);
                break;
            case 6:
                board[6]=userCharacter;
                showBoard(board);
                break;
            case 7:
                board[7]=userCharacter;
                showBoard(board);
                break;
            case 8:
                board[8]=userCharacter;
                showBoard(board);
                break;
            case 9:
                board[9]=userCharacter;
                showBoard(board);
                break;
            default:
                break;
        }

    }

        static char doToss()
        {
            int option = (int) ((Math.random() * 10 % 2) + 1);
            if(option==userPlayer)
            {
                System.out.println("user is playing the chance");
                return userCharacter;
            }
            else
            {
                System.out.println("Computer is playing the chance");
                return  computerCharacter;
            }
           // return option;
        }

    public static void main(String[] args) {
        createBoard(board);
        chooseLetter();
        playerMove();

    }


}
