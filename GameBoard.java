public class GameBoard extends Game{

private char[][] markers = new char[3][3];
private int noInRow = 3;                                                //Simpel version "tre i rad"
public GameBoard(char[][] markers){
    super();
    this.markers = markers;
}

public void printBoard(){

    System.out.println("1   " + markers[0][0] + "  | " + markers[0][1] + " | " + markers[0][2]);
    System.out.println("    ---+---+---");
    System.out.println("2   " + markers[1][0] + "  | " + markers[1][1] + " | " + markers[1][2]);
    System.out.println("    ---+---+---");
    System.out.println("3   " + markers[2][0] + "  | " + markers[2][1] + " | " + markers[2][2]);
    System.out.println("    -----------");
    System.out.println("     a   b   c");
}

    //oki på börjar på en metod för att hitta ett vinnande mönster. rad för rad samt höger och vänster diagonal

    public boolean checkWinningPatterns(String pattern){            //Todo add param. for how many bricks in a row

        char[] pt = new char[noInRow];  //convert pattern string to char[]
        int count = 0;

        for(int i= 0; i < pt.length;i++) {
            pt[i] = pattern.charAt(i);
        }

    //check the rows for a winning patter
    for(int i = 0; i < markers.length; i++)
        for(int j = 0; j < markers[i].length;j++){          //outer for rows
        System.out.println(markers[i][j] + " ");            //inner for columns
            if(markers[i][j] == pt[i]) {
                System.out.println("hittade en");   //TODO only for testing
                count++;
                System.out.println(" antal i rad " + count); //Todo only for testing

                if(count == noInRow)
                    return true;
            }
        }
     System.out.println();
    return false;                //Todo ändra
}

}

/*int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
};

for (int i = 0; i < array.length; i++) {
    // Iterera över varje rad
int[] row = array[i];
    for (int j = 0; j < row.length; j++) {
        // Iterera över varje element i raden
        System.out.print(row[j] + " ");
    }
            System.out.println(); // Ny rad efter varje rad i arrayen
}*/

