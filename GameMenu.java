import java.util.Scanner;

public class GameMenu extends Game {

    public static void ticTacToeMenu() {


        Scanner sc = new Scanner(System.in);
        Boolean exit = false;

        while (!exit) {

            System.out.println("** Tre-I-Rad");
            System.out.println("1. Starta ett nytt spel, 2 personer");
            System.out.println("2. Spela mot datorn");
            System.out.println("3. Avsluta");

            int val = sc.nextInt();

            switch (val) {
                case 1:
                    gameLoop(startNewGame());

                    break;
                case 2:
                    // newGameComputer();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Avslutar, tack och hej");
                    break;
                default:
                    System.out.println("ogiltigt val, försök igen.");
            }
            //sc.close();
        }


    }

    /**
     * Starts upp a new game of classic 3X3 Tic-tac-toe.
     * method returns a game object. which includes player names and a new game board
     *
     * @return  Game object
     */
    public  static Game startNewGame() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Vad heter spelar no 1: ");
        String pl1 = sc.nextLine();

        System.out.print("vad heter spelare no 2: ");
        String pl2 = sc.nextLine();

        //Setup and return  new game and player object

        return new Game(pl1, pl2);
    }

    /**
     * Main loop that handles new move, check for win, draw etc.
     *
     * @param game object of type Game
     */
    public static void gameLoop(Game game)

    {
        boolean running = true;
        int roundNr.

        while (running) {

            game.clearMarkers();
            System.out.println("Startar ett nytt spel");
            game.gameBoard.printBoard();


            while (true) {
                //player 1 turn. Make a move check if it is winning or even
                System.out.println(game.player1.getName() + " din tur");
                game.makeMove(game.player1, game);
                game.gameBoard.printBoard();

                if (game.gameBoard.winner(game.player1)) {
                    System.out.println("vi har en vinnare!! Grattis " + game.player1.getName());
                    game.gameBoard.printScoreBoard(game.player1, game.player2);
                    break;
                } else if (game.gameBoard.boardFull()) {
                    System.out.println("Brädet fullt ingen vinnare");
                    break;
                }

                //player 2 turn. Make a move check if it is winning or even
                System.out.println(game.player2.getName() + " din tur");
                game.makeMove(game.player2, game);
                game.gameBoard.printBoard();

                if (game.gameBoard.winner(game.player1)) {
                    System.out.println("vi har en vinnare!! Grattis " + game.player2.getName());
                    game.gameBoard.printScoreBoard(game.player1, game.player2);
                    break;
                } else if (game.gameBoard.boardFull()) {
                    System.out.println("Brädet fullt ingen vinnare");
                    break;
                }
            }
        }

    }
}








