

public class Main {
    public static void main(String[] args) {

        /* The game is divided into 7 different classes

                    Superclass   -Game.java:  contains all the methods to handle the game logic. move tiles etc.
                    Subclass    -GameBoard.java:   methods and   logic for handling the game board
                                -player.java:   stores all information about the players
                                -TicTac.java:   methods and logic for playing classic TicTacToe, 2 humans against each other
                                -TicTacComputer.java: methods and logic for handling a game between a human and a computer
                                -Misere.java:   methods and logic to play a variation of classic TicTacToe

                   GameMenu.java for menus and staring routines for each game
         */


        // start the magnificent game of Tic tac toe
        GameMenu.ticTacToeMenu();




    }

}