public class Main {
    public static void main(String[] args) {


        Game g1 = new Game("janne", "Peter");

        GameBoard gameBoard = g1.gameBoard;


        //Just for test purpose fill the array A to I
        int ch = 65;

        for (int i = 0; i < g1.markersArray.length; i++)
            for (int j = 0; j < g1.markersArray.length; j++) {
                g1.markersArray[i][j] = (char) ch;
                ch++;
            }


        gameBoard.printBoard();
        gameBoard.print();

    }
}