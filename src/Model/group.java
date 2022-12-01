package Model;

public class group {

    String name;

    String jersey_color;

    int fifa_ranking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_color() {
        return jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        this.jersey_color = jersey_color;
    }

    public int getFifa_ranking() {
        return fifa_ranking;
    }

    public void setFifa_ranking(int fifa_ranking) {
        this.fifa_ranking = fifa_ranking;
    }

    public group(String name, String jersey_color, int fifa_ranking) {
        this.name = name;
        this.jersey_color = jersey_color;
        this.fifa_ranking = fifa_ranking;
    }


}
