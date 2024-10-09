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

        //make sure row and col is in limits
        if ((row > markersArray.length || row < 1) || (col < 0 || col > markersArray[0].length)) {   // [0] for column
            System.out.println("fel värde på rad eller kolumn, försök igen");
            return false;
        }
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
     * make a random selection of which player who will start
     */
    public Player setFirstPlayer() {         //(Player pl1, Player pl2){

        Random rand = new Random();

        int tal = (rand.nextInt(2) + 1);

        if (tal == 1) {
            player1.setStartingPlayer(true);
            System.out.println(player1.getName() + " Startar med markören " + player1.getMarker());
            return player1;
        } else {
            player2.setStartingPlayer(true);
            System.out.println(player2.getName() + " Startar med markören " + player2.getMarker());
            return player2;
        }

    }



    public void makeMove(Player player, Game game) {               //TODO Fortsätt men denna Torsdag

        Scanner sc = new Scanner(System.in);

        boolean attempt = true;

       // Check if user input i a valid int
        while (attempt) {
            try {
                System.out.println("ange vilken rad:");
                this.row = sc.nextInt();
                System.out.println("ange vilken kolumn:");
                this.col = sc.nextInt();
                attempt = false;
            } catch (InputMismatchException e) {
                sc.nextLine();                          // clear the wrong line
                System.out.println("Felaktig inmatning måste vara ett heltal");
            } catch (NoSuchElementException e) {
                System.exit(0);
            }
        }
        System.out.println(player.getMarker());             // TODO remove
        if (checkValidMove(row - 1, col - 1)) {         //user input will not be 0
           markersArray[row - 1][col - 1] = player.getMarker();
           System.out.println("markerat med ett " + player.getMarker() +" " +row + " " + col);                                                         //TODO remove trouble shooting
        }
        else {
            System.out.println("Rutan upptagen");

        }
    }
}