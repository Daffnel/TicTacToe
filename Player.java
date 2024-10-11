
public class Player extends Game {

    private String name;
    private char marker;
    private int winnings;

    private boolean isComputer;

    public Player(String name, char marker){
        this.name = name;
        this.marker = marker;

        this.isComputer = false;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setWinnings(int winnings) {
        this.winnings = winnings;
    }


    public String getName() {
        return name;
    }

    public char getMarker() {
        return marker;
    }


    public int getWinnings() {
        return winnings;
    }




    }

