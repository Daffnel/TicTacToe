public class Game {

    GameBoard gameBoard;
    private Player  player1;
    private Player player2;

    public Game() {}

    char[][] markersArray = new char[3][3];

    public Game(String player1, String player2){
        //this.gameBoard = new GameBoard(markersArray);
        this.gameBoard = new GameBoard(markersArray);
        this.player1 = new Player(player1,'X');             //player1 default marker 'X'
        this.player2 = new Player(player2,'O');
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


}
