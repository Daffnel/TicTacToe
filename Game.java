public class Game {

    GameBoard gameBoard;
    private Player  player1;
    private Player player2;

    public Game() {}

    char[][] markersArray = new char[3][3];

    /** Constructor  for the game, player1 starts by default with X as marker
     *
     * @param player1   name of player no 1
     * @param player2   name of player no 2
     */
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

    /**
     *  Converts user input for square coordinates into number for row and column
     *  separates one digit and one number
     *
      * @param input user input a1, b3, 3c etc.
     * @return array [0] = rows  [1] = column
     */

    public int[] convertRowAndColumn(String  input){
        String str;
        str = input.trim();
        str = str.toLowerCase();

        if(str.length()>2)
            System.out.println("För många tecken");




        int i = 0;
        int[] para = new int[2];

        return para;
    }
}
