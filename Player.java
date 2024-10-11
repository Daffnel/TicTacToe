import java.util.Scanner;

public class Player extends Game {

    private String name;
    private char marker;
    private  boolean startingPlayer = false;
    private int winnings;

    public Player(String name, char marker){
        this.name = name;
        this.marker = marker;
    }

    public Player(){}

    public void setWinnings(int winnings) {
        this.winnings = winnings;
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

    public int getWinnings() {
        return winnings;
    }

    public boolean isStartingPlayer() {
        return startingPlayer;


    }
}
