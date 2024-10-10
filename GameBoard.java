import java.util.ArrayList;

public class GameBoard extends Game{

private char[][] markers = new char[3][3];
private int noInRow = 3;                                                //Simpel version "tre i rad"
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
    System.out.println("     a   b   c");
}

    public boolean winner(Player player) {

        //check rows and column for a win
        for (int i = 0; i < markers.length; i++)
            if ((markers[i][0]) == player.getMarker() && markers[i][1] == player.getMarker() && markers[i][2] == player.getMarker() ||
                    (markers[0][i] == player.getMarker() && markers[1][i] == player.getMarker()) && markers[2][i] == player.getMarker()) {
                return true; // winning row or column
            }
        //diagonals
        if ((markers[0][0]) == player.getMarker() && markers[1][1] == player.getMarker() && markers[2][2] == player.getMarker() ||
                (markers[0][2] == player.getMarker() && markers[1][1] == player.getMarker()) && markers[2][0] == player.getMarker()) {
            return true; // winning on a diagonal
        }

        return false;

    }



    }





