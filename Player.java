public class Player extends Game {

    private String name;
    char marker;

    public Player(String name, char marker){
        super();
        name = this.name;
        marker = this.marker;
    }

    public String getName() {
        return name;
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
