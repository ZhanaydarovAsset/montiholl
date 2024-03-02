package org.example;

public class Main {
    public static void main(String[] args) {
        MontyHallGame game = new MontyHallGame();
        int trials = 1000;

        for (int i = 0; i < trials; i++) {
            game.playGame(true); // Смена двери
           //game.playGame(false); // Без смены двери,
        }

        System.out.println("Wins with switch: " + game.getWins());
        System.out.println("Losses with switch: " + game.getLosses());
    }
}