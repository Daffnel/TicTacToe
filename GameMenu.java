import java.util.Scanner;

public class GameMenu {

   public static void ticTacToeMenu(){

      Scanner sc = new Scanner(System.in);

      Boolean exit = false;

      while(!exit){

         System.out.println("** Tre-I-Rad");
         System.out.println("1. Starta ett nytt spel, 2 personer");
         System.out.println("2. Spela mot datorn");

         int val = sc.nextInt();

         switch(val){
            case 1:
               startNewgame();
               break;
            case 2:
               newGameComputer();
               break;
            default:
               System.out.println("ogiltigt val, försök igen.");





         }
      }







   }

}
