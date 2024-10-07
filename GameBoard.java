import java.util.ArrayList;

public class GameBoard extends Game{

private char[][] markers = new char[3][3];

public GameBoard(char[][] markers){
    super();
    this.markers = markers;
}

public void printBoard(){

    System.out.println(markers[0][0] + "  | " + markers[0][1] + " | " + markers[0][2]);
    System.out.println("---+---+---");
    System.out.println(markers[1][0] + "  | " + markers[1][1] + " | " + markers[1][2]);
    System.out.println("---+---+---");
    System.out.println(markers[2][0] + "  | " + markers[2][1] + " | " + markers[2][2]);
}


}

}
