import java.util.Scanner;

public class GameMenu {

    public static void ticTacToeMenu() {


        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {

            System.out.println("** Tre-I-Rad");
            System.out.println("1. Starta ett nytt spel, 2 personer");
            System.out.println("2. Spela mot datorn");
            System.out.println("3. Spela Misere (variant av Tre-i-rad där det gäller att 'förlora'");
            System.out.println("4. Avsluta");

            int val = sc.nextInt();

            switch (val) {
                case 1:
                    playTicTacHumans();
                    break;
                case 2:
                    PlayTicTacComputer();
                    break;
                case 3:
                    playMisere();
                    break;
                case 4:
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
     * method returns a game object. which includes object of player names and object of board
     *
     * @return game an object of Game Class
     */
    public static Game startNewGame(boolean computerPlayer) {

        Scanner sc = new Scanner(System.in);
        String pl1, pl2;
        if (!computerPlayer) {
            System.out.print("Vad heter spelar no 1: ");
            pl1 = sc.nextLine();

            System.out.print("vad heter spelare no 2: ");
            pl2 = sc.nextLine();

            return new Game(pl1, pl2);             //Setup and return  new game and player object

        } else {

            System.out.print("Vad heter spelar no 1: ");
            pl1 = sc.nextLine();

            pl2 = "Hactar";
            System.out.println("Du kommer nu att möta den berömda datorspelarn " + pl2);

            Game g1 = new Game(pl1, pl2);    //Setup and return  new game and player object

            g1.player2.setComputer(true);

            return g1;

        }

    }

    public static void playMisere() {

        System.out.println("Misere eller 'Fällan'  är en ovanlig variant av spelet 'Tre-i-rad', där spelarnas" + " huvuduppgift inte är att vinna, utan att undvika att vinna. ");

        Misere msGame = new Misere();
        Game game = startNewGame(false);

        msGame.play(game);
    }

    public static void playTicTacHumans() {

        System.out.println("Klassisk tre i rad");

        TicTac ticTac = new TicTac();
        Game game2 = startNewGame(false);

        ticTac.play(game2);
    }

    public static void PlayTicTacComputer() {

        System.out.println("En Hård match i Tre-i-rad mot superhjärnan Hactar");

        TicTacComputer ticTacComp = new TicTacComputer();
        Game game3 = startNewGame(true);

        ticTacComp.play(game3);

    }

}











