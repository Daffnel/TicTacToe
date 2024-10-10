import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialize and launch the game
        Scanner sc = new Scanner(System.in);

        System.out.println("**** Tre-i-Rad ****");

        System.out.println("vad heter spelar nr1");
        String pl1 = sc.nextLine();

        System.out.println("vad heter spelar nr2");
        String pl2 = sc.nextLine();

        Game game = new Game(pl1,pl2);          //new game and board fill the array with ' '
        game.clearMarkers();

            gameLopp(game);

    }
            public static void gameLopp(Game game){             //TODO fixa detta på torsdag


             boolean spela = true;
             while(spela){


                 //First player
                 game.gameBoard.printBoard();
                   System.out.println(game.player1.getName());
                   game.makeMove(game.player1,game);

                   if(game.gameBoard.winner(game.player1)){
                       System.out.println(game.player1.getName() + "har vunnit!!");
                       game.player1.setWinnings(1 + game.player1.getWinnings());
                   }


                    //Second player turn
                    //game.gameBoard.clearScreen();
                    game.gameBoard.printBoard();
                    System.out.println(game.player2.getName());
                    game.makeMove(game.player2,game);

                 if(game.gameBoard.winner(game.player2)){
                     System.out.println(game.player2.getName() + "har vunnit!!");
                     //System.out.print(game.gameBoard.winner()+"\n");
                 }









                }









}

}