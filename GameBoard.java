
public class GameBoard extends Game{

private char[][] markers = new char[3][3];

public GameBoard(char[][] markers){
    super();
    this.markers = markers;
}

    /**
     * Prints a simple 3X3 board
     */
    public void printBoard(){

    System.out.println("1   " + markers[0][0] + "  | " + markers[0][1] + " | " + markers[0][2]);
    System.out.println("    ---+---+---");
    System.out.println("2   " + markers[1][0] + "  | " + markers[1][1] + " | " + markers[1][2]);
    System.out.println("    ---+---+---");
    System.out.println("3   " + markers[2][0] + "  | " + markers[2][1] + " | " + markers[2][2]);
    System.out.println("    -----------");
    System.out.println("     1   2   3");
}

    /**
     * Running through the markers array and checking if there are any winning patterns
     *
      * @param player objet of Player class
     * @return true if a winning combination is found
     */
public boolean winner(Player player) {

        //check rows and column for a win
        for (int i = 0; i < markers.length; i++)
            if ((markers[i][0]) == player.getMarker() && markers[i][1] == player.getMarker() && markers[i][2] == player.getMarker() ||
                    (markers[0][i] == player.getMarker() && markers[1][i] == player.getMarker()) && markers[2][i] == player.getMarker()) {

                player.setWinnings(player.getWinnings()+ 1);
                return true; // winning row or column
            }
        //diagonals
        if ((markers[0][0]) == player.getMarker() && markers[1][1] == player.getMarker() && markers[2][2] == player.getMarker() ||
                (markers[0][2] == player.getMarker() && markers[1][1] == player.getMarker()) && markers[2][0] == player.getMarker()) {

            player.setWinnings(player.getWinnings()+ 1);
            return true; // winning on a diagonal
        }

        return false;

    }


    /**
     * Checks if the board is full, which means the game is a draw
     *
     * @return true if board is full
     */
    public boolean boardFull() {
        for (int i = 0; i < markers.length;i++)
            for (int j = 0; j < markers.length; j++) {
                if (markers[i][j] == ' ')
                    return false;
                }
        return true;
    }


    /**
     * Prints the scoreboard
     *
     * @param pl1 player objet for player 1
     * @param pl2 player object for player 2
     */
    public void  printScoreBoard(Player pl1, Player pl2){

        System.out.println("*** SCOREBOARD **");
        System.out.println(" " + pl1.getName() + "       " + pl1.getWinnings());
        System.out.println(" " + pl2.getName() + "       " + pl2.getWinnings());
        System.out.println("******************");

    }


    }







