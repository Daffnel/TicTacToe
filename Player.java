import java.util.Scanner;

public class Player extends Game {

    private String name;
    private char marker;
    private  boolean startingPlayer = false;

    public Player(String name, char marker){
        this.name = name;
        this.marker = marker;
    }


    public String getName() {
        return name;
    }

    public void setStartingPlayer(boolean startingPlayer) {
        this.startingPlayer = startingPlayer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMarker() {
        return marker;
    }

    public void setMarker(char marker) {
        this.marker = marker;
    }
}
