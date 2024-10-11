import java.util.Scanner;

public class TicTac extends Game {

    public TicTac(){}


    public void play(Game game) {
        Scanner sc = new Scanner(System.in);
        int roundNr = 0;                            //keep track of rounds played, player1 plays odd, player 2 plays even

        while (true) {

            game.clearMarkers();
            System.out.println("Startar ett nytt spel");
            game.gameBoard.printBoard();

            if (roundNr > 0) {                                        //quit game upon users request
                System.out.print("vill du fortsätta spela j/n ");
                String str = sc.nextLine();
                if (str.equalsIgnoreCase("n")) break;
            }
            //
            while (true) {
                if (roundNr % 2 == 0) {                              //player1 plays odd, player 2 plays even
                    //player 1 turn. Make a move check if it is winning or even
                    System.out.println(game.player1.getName() + " din tur");
                    game.makeMove(game.player1);
                    game.gameBoard.printBoard();
                    roundNr++;

                    if (game.gameBoard.winner(game.player1)) {
                        System.out.println("vi har en vinnare!! Grattis " + game.player1.getName());
                        game.gameBoard.printScoreBoard(game.player1, game.player2);
                        break;
                    } else if (game.gameBoard.boardFull()) {
                        System.out.println("Brädet fullt ingen vinnare");
                        break;
                    }
                } else {
                    //player 2 turn. Make a move check if it is winning or even
                    System.out.println(game.player2.getName() + " din tur");
                    if (game.player2.isComputer()) {                             //if player 2 is a computer player run computerPlays()
                        game.computerPlays(game.player2);
                    } else if (!game.player2.isComputer()) {
                        game.makeMove(game.player2);
                    }

                    //game.gameBoard.clearTerminal();               //Todo remove just for testing purpose
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