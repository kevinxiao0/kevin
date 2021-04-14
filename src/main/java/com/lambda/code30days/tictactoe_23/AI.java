package com.lambda.code30days.tictactoe_23;

import java.util.ArrayList;
import java.util.Random;

public class AI {

    public int pickSpot(TicTacToe game) {
        ArrayList<Integer> choices = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (game.board[j] == '-') {
                choices.add(j + 1);
            }
        }
        Random random = new Random();
        int choice = choices.get((Math.abs(random.nextInt() % choices.size())));
        return choice;
    }

}