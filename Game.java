import java.util.Random;
import java.util.Scanner;

public class Game {

    GameBoard gameBoard;
    Player player1;
    Player player2;

    public Game() {
    }

    char[][] markersArray = new char[3][3];

    /**
     * Constructor  for the game, player1 starts by default with X as marker
     *
     * @param pl1 name of player no 1
     * @param pl2 name of player no 2
     */
    public Game(String pl1, String pl2) {
        //this.gameBoard = new GameBoard(markersArray);
        this.gameBoard = new GameBoard(markersArray);
        this.player1 = new Player(pl1, 'X');             //player1 default marker 'X'
        this.player2 = new Player(pl2, 'O');
    }


    /**
     * Check that the box is not already occupied by a marker
     *
     * @param row desired row
     * @param col desired column
     * @return true if move is valid
     */
    public boolean checkValidMove(int row, int col) {

        if (markersArray[row][col] == ' ')
            return true;
        else
            return false;
    }

    /**
     * Reset and clears the array holding markers position
     */
    public void clearMarkers() {
        for (int i = 0; i < markersArray.length; i++)
            for (int j = 0; j < markersArray.length; j++) {
                markersArray[i][j] = ' ';
            }
    }

    /**
     * make a random selection of which player will start
     */
    public void  setFirstPlayer() {//(Player pl1, Player pl2){

        Random rand = new Random();

        int tal = (rand.nextInt(2) + 1);

        if(tal == 1) {
            player1.setStartingPlayer(true);
            System.out.println(player1.getName() + " Startar med markören " + player1.getMarker());
        }
        else {
            player2.setStartingPlayer(true);
            System.out.println(player2.getName() + " Startar med markören "+ player2.getMarker());
        }

    }

    public void makeAmove(Player plauer,int row, int column){







    }


}
