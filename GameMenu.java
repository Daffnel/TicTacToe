import java.util.Scanner;

public class GameMenu extends Game{
   public GameMenu() {
   super();
   }

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
               startNewGame();
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
   public static void startNewGame(){

      Scanner sc = new Scanner(System.in);


      System.out.print("Vad heter spelar no 1: ");
       String pl1 = sc.nextLine();

      System.out.print("vad heter spelare no 2: ");
      String pl2 = sc.nextLine();

      Game game = new Game(pl1, pl2);   //Setup a new game and player object

      //method for reset the array not working quick and easy fix
      for(int i = 0; i < game.markersArray.length; i++)
         for(int j = 0; j < game.markersArray.length; j++)
            game.markersArray[i][j] = ' ';

      game.gameBoard.printBoard();

      boolean apa = true;

      while(apa) {
         //player 1 turn
         System.out.println(game.player1.getName() + " din tur");
         game.makeMove(game.player1, game);
         game.gameBoard.printBoard();

         if(game.gameBoard.winner(game.player1)) {
            System.out.println("vi har en vinnare!! Grattis " + game.player1.getName());
            break;
         }

         //player 2 turn
         System.out.println(game.player2.getName() + " din tur");
         //game.gameBoard.printBoard();
         game.makeMove(game.player2, game);
         game.gameBoard.printBoard();

         if(game.gameBoard.winner(game.player1)) {
            System.out.println("vi har en vinnare!! Grattis " + game.player2.getName());
            break;
         }
      }
   }
}








