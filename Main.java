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

/*
                Player secondPl = new Player();
                Player firstPl = new Player();

             if(game.setFirstPlayer() == game.player1){
                 firstPl = game.player1;
                 secondPl = game.player2;
             }
             else if(game.setFirstPlayer() == game.player2){
                  secondPl = game.player1;
                 firstPl = game.player2;
             }*/

             boolean spela = true;
             while(spela){

                    //first players turn
                    game.gameBoard.clearScreen();
                    game.gameBoard.printBoard();
                   System.out.println(game.player1.getName());
                   game.makeMove(game.player1,game);


                    //Second player turn
                    game.gameBoard.clearScreen();
                    game.gameBoard.printBoard();
                   System.out.println(game.player2.getName());
                   game.makeMove(game.player2,game);









                }









}

}