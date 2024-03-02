package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MontyHallGame {
    private Random random = new Random();
    @Getter
    private int wins = 0;
    @Getter
    private int losses = 0;

    public void playGame(boolean switchDoor) {
        int winningDoor = random.nextInt(3);
        int playerChoice = random.nextInt(3);

        List<Integer> doors = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            doors.add(i);
        }

        int finalPlayerChoice = playerChoice;
        doors.removeIf(door -> door != finalPlayerChoice && door != winningDoor);

        if (switchDoor) {
            for (Integer door : doors) {
                if ( door != playerChoice) {
                    playerChoice = door;
                }
            }
        }


        if (playerChoice == winningDoor) {
            wins++;
        } else {
            losses++;
        }
    }

}

