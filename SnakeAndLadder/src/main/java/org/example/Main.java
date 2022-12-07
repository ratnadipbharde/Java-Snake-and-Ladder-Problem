package org.example;

public class Main {
    public static final int INITIAL = 0;

    public static void main(String[] args) {
        Main main = new Main();
        int player1Position = INITIAL;
        int player2Position = INITIAL;
        while (main.player1(player1Position)<=100 && Main.player2(player2Position) <= 100){
            if (main.player1(player1Position)==100){
                System.out.println("player 1 is winner");
                return;
            }
            else if (player2(player2Position)==100){
                System.out.println("player 2 is winner");
                return;
            }else {
                player1Position= main.player1(player1Position);
                player2Position= player2(player2Position);
            }
        }
    }

    private int player1(int player1Position) {
        int playerDie = (int) Math.floor(Math.random() * 6 + 1);
        int optionDie = (int) Math.floor(Math.random() * 3);
        switch (optionDie) {
            case 1:
                System.out.println("Player 1 Play : Ladder "+playerDie);
                player1Position = player1Position + playerDie;
                player1(player1Position);
                break;
            case 2:
                System.out.println("Player 1 Play : Snake "+optionDie);
                player1Position = player1Position - playerDie;
                break;
            default:
                break;
        }
        System.out.println("Player 1 Current place:- " + player1Position );
        if (player1Position < 0){
            player1Position=0;
        }else
        if (player1Position > 100) {
            System.out.println("Player 1  Current place is "+ player1Position +
                    " after grater than 100 that's why play not consider and again play " );
            player1Position = player1Position - playerDie;
        }
        return player1Position;
    }

    private static int player2(int player2Position) {
        int playerDie = (int) Math.floor(Math.random() * 6 + 1);
        int optionDie = (int) Math.floor(Math.random() * 3);
        switch (optionDie) {
            case 1:
                System.out.println("Player 2 Play : Ladder "+playerDie);
                player2Position = player2Position + playerDie;
                player2(player2Position);
                break;
            case 2:
                System.out.println("Player 2 Play : Snake "+optionDie);
                player2Position = player2Position - playerDie;
                break;
            default:
                break;
        }
        System.out.println("Player 2  Current place:- " + player2Position );
        if (player2Position < 0){
            player2Position=0;
        }else
        if (player2Position > 100) {
            System.out.println("Player 2  Current place is "+ player2Position +
                    " after grater than 100 that's why play not consider and again play " );
            player2Position = player2Position - playerDie;
        }
        return player2Position;
    }
}

