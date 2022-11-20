package org.example;

public class Main {
    public static final int INITIAL = 0;

    public static void main(String[] args) {
        int currentPosition = INITIAL;
        System.out.println("Start Position : " + INITIAL);
        int playerDie = (int) Math.floor(Math.random() * 6 + 1);
        int optionDie = (int) Math.floor(Math.random() * 3);
        System.out.println(optionDie);
        switch (optionDie) {
            case 1:
                System.out.println("Ladder");
                currentPosition = currentPosition + playerDie;
                break;
            case 2:
                System.out.println("Snake");
                currentPosition = currentPosition - playerDie;
                break;
            default:
                break;
        }
        System.out.println("Current place:- "+currentPosition);
    }
}
