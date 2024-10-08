public class Main {
    public static void main(String[] args) {

        //Här vill jag Skapa objekten game, player och board för att gör det enkelt


        //Player pl1 = new Player("janne",'X');
       // Player pl2 = new Player("Hasse",'P');

        Game game1 = new Game("hasse","Ludde");

        game1.setFirstPlayer();



        //for testing purpose fill the array a to i

        int a = 97;

        for(int i = 0; i < game1.markersArray.length; i++)
            for(int j = 0; j < game1.markersArray.length;j++) {
                game1.markersArray[i][j] = (char) a;
                a++;
            }
        game1.gameBoard.printBoard();

    }
}