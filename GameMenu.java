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
                    gameLoop(startNewGame(false));

                    break;
                case 2:
                    gameLoop(startNewGame(true));
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
    public static Game startNewGame(boolean computerPlayer) {

        Scanner sc = new Scanner(System.in);
        String pl1, pl2;
        if (!computerPlayer) {
            System.out.print("Vad heter spelar no 1: ");
            pl1 = sc.nextLine();

            System.out.print("vad heter spelare no 2: ");
            pl2 = sc.nextLine();

            return new Game(pl1, pl2,false);             //Setup and return  new game and player object

        } else {

            System.out.print("Vad heter spelar no 1: ");
            pl1 = sc.nextLine();

            pl2 = "Hactar";
            System.out.print("Du kommer nu att möta den berömda datorspelarn " + pl2);

            return new Game(pl1, pl2,true);              //Setup and return  new game and player object
        }



    }



    public static void gameLoop(Game game)

    {
        boolean running = true;
        int roundNr=0;                            //keep track of rounds played, player1 plays odd, player 2 plays even

        while (running) {

            game.clearMarkers();
            System.out.println("Startar ett nytt spel");
            game.gameBoard.printBoard();

            // can be broken down into different methods, not done due to lack of time :-(
            while (true) {
                    if(roundNr % 2 == 0) {                              //player1 plays odd, player 2 plays even
                        //player 1 turn. Make a move check if it is winning or even
                        System.out.println(game.player1.getName() + " din tur");
                        game.makeMove(game.player1, game);
                        game.gameBoard.printBoard();
                        roundNr ++;

                        if (game.gameBoard.winner(game.player1)) {
                            System.out.println("vi har en vinnare!! Grattis " + game.player1.getName());
                            game.gameBoard.printScoreBoard(game.player1, game.player2);
                            break;
                        } else if (game.gameBoard.boardFull()) {
                            System.out.println("Brädet fullt ingen vinnare");
                            break;
                        }
                    }
                    else {
                        //player 2 turn. Make a move check if it is winning or even
                        System.out.println(game.player2.getName() + " din tur");
                        if (game.player2.isComputer())                              //if player 2 is a computer player run computerPlays()
                            game.computerPlays(game, game.player2);
                        else {
                            game.makeMove(game.player2, game);
                            game.gameBoard.printBoard();
                            roundNr++;

                            if (game.gameBoard.winner(game.player2)) {
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

    }
}








