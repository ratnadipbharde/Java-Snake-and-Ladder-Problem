package org.example;

public class Main {
    public static final int initialPosition = 0;

    public static void main(String[] args) {
        int currentPosition = initialPosition;
        System.out.println("Start Position : " + initialPosition);
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
