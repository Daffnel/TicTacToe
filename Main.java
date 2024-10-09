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
            public static void gameLopp(Game game){

                int round = 0;









}

}