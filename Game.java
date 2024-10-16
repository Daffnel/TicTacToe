import java.util.*;

public class Game {

    int row, col;
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
        this.player1 = new Player(pl1, 'X');             //player1 default marker 'X' and never plays as computer
        this.player2 = new Player(pl2, 'O');
    }


    /**
     * Check that the box is not already occupied by a marker
     * or rows and columns is out of limits
     *
     * @param row desired row
     * @param col desired column
     * @return true if move is valid
     */
    public boolean checkValidMove(int row, int col) {

        //make sure row and col is in limits
        if ((row > markersArray.length || row < 0) || (col < 0 || col > markersArray[0].length - 1)) {   // [0] for column
            System.out.println("fel värde på rad eller kolumn, försök igen");
            return false;
        }
        if (markersArray[row][col] == ' ') return true;
        else return false;
    }

    /**
     * Reset and clears the array holding markers position
     */
    public void clearMarkers() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                markersArray[i][j] = ' ';
            }
    }


    /*
     * Moves a game piece. Also checks that input values is ok
     * and that the move is a valid move.
     *
     *
     * A simpler method to be a number from 1 to 9.
     * Made with rows and columns if you want to expand the game for a larger board
     *
     *
     */
    public void makeMove(Player player) {

        Scanner sc = new Scanner(System.in);
        boolean attempt = true;


        // Check if user input i a valid int
        while (attempt) {
            try {
                System.out.println("ange vilken rad:");
                this.row = (sc.nextInt() - 1);                  //user input will not 0
                System.out.println("ange vilken kolumn:");
                this.col = (sc.nextInt() - 1);
                attempt = false;
            } catch (InputMismatchException e) {
                sc.nextLine();                          // clear the wrong line
                System.out.println("Felaktig inmatning måste vara ett heltal");
            } catch (NoSuchElementException e) {
                System.exit(0);
            }
        }

        if (checkValidMove(row, col)) {
            markersArray[row][col] = player.getMarker();
        } else {
            System.out.println("Rutan upptagen eller felaktig data. försök igen");
            makeMove(player);
        }

    }

    /* The Computer method, not the smartest player!
     * just puts out his pieces randomly wherever there is a free space.
     */
    public void computerPlays(Player player) {

        int row, col;


        Random rand = new Random();

        // Loop until random row and column is valid
        while (true) {
            row = rand.nextInt(3);
            col = rand.nextInt(3);

            if (checkValidMove(row, col)) {
                markersArray[row][col] = player.getMarker();
                break;
            }

        }


    }
}