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
    System.out.println("     1   2   3");
}


    /** Checks if there is a winning three in a row for a 3 X 3  board
     *
     * @return true if there is 3 in a row
     */
    public boolean checkWinningPatterns(){
//for a board 3 X 3 there is 8 possible winning patterns
    if(markers[0][0] == markers[0][1] && markers[0][1] == markers[0][2])
        return true;
    else if(markers[1][0] == markers[1][1] && markers[1][1] == markers[1][2])
        return true;
    else if (markers[2][0] == markers[2][1] && markers[2][1] == markers[2][2])
        return true;
    else if (markers[0][0] == markers[1][0] && markers[1][0] == markers[2][0])
        return true;
    else if(markers[0][1] == markers[1][1] && markers[1][1] == markers[2][1])
        return true;
    else if(markers[0][2] == markers[1][2] && markers[1][2] == markers[2][2])
        return true;
    else if(markers[2][0] == markers[1][1] && markers[1][1] == markers[0][2])
        return true;
    else if(markers[0][0] == markers[1][1] && markers[1][1] == markers[2][2])
        return true;
    else
    return false;

    }

    public void printScoreBoard(Game game){

        clearScreen();
        System.out.println("*** SCOREBOARD ********");
        System.out.println("** " + game.player1.getName() + " " + game.player1.getWinnings() + " Vinster" + " ** ");
        System.out.println("** " + game.player2.getName() + " " + game.player2.getWinnings() + " Vinster"+ "  **" );
        System.out.println("***********************");
    }

    /**
     * simple and easy routine to clear the terminal window
     */
    public void clearScreen(){
        for(int i = 0 ; i < 80; i++)
            System.out.println();
    }


    }





