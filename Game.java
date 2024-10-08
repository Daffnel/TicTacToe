import java.util.Random;
import java.util.Scanner;

public class Game {

    GameBoard gameBoard;
    Player player1;
    Player Player2;

    public Game() {}

    char[][] markersArray = new char[3][3];

    /** Constructor  for the game, player1 starts by default with X as marker
     *
     * @param pl1   name of player no 1
     * @param pl2   name of player no 2
     */
    public Game(String pl1, String pl2){
        //this.gameBoard = new GameBoard(markersArray);
       this.gameBoard = new GameBoard(markersArray);
        //Player player1 = new Player(pl1, 'X');             //player1 default marker 'X'
        //Player player2 = new Player(pl2, 'O');
    }


    /**
     * Check that the box is not already occupied by a marker
     *
     * @param row desired row
     * @param col  desired column
     * @return true if move is valid
     */
    public boolean checkValidMove(int row, int col){

        if(markersArray[row][col] == ' ')
            return true;
        else
            return false;
    }

    /**
     * Reset and clears the array holding markers position
     */
    public void clearMarkers(){
        for(int i = 0; i < markersArray.length; i++)
            for(int j = 0; j < markersArray.length; j++) {
                markersArray[i][j] = ' ';
            }
    }


    public static void StartNewGame(){

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();






    }
}
