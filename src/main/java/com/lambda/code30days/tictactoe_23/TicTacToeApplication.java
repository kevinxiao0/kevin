package com.lambda.code30days.tictactoe_23;

import java.util.Scanner;

public class TicTacToeApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean doYouWantPlay = true;

        while (doYouWantPlay) {
            System.out.println("Welcome Tic Rac Toe");
            System.out.println("Pick a character for you");
            System.out.println();
            char playerToken = scanner.next().charAt(0);
            System.out.println("Pick a character for your opponent");
            char opponentToken = scanner.next().charAt(0);

            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();

            System.out.println("Now Play the Game");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("notOver")) {
                if (game.currentMarker == game.userMarker) {

                    System.out.println("Its User turn");
                    int spot = scanner.nextInt();
                    while (!game.playTurn(spot)) {
                        System.out.println("Try again " + spot + " was taken");
                        spot = scanner.nextInt();
                    }
                    System.out.println("you picked " + spot);
                } else {
                    System.out.println("Its PC turn");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("PC Picked " + aiSpot);
                }
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println("Press Y to restart, other exit");
            char reponse = scanner.next().charAt(0);
            doYouWantPlay = (reponse == 'Y');
            System.out.println();
        }
    }
}
