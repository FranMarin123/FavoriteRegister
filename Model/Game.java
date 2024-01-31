package Model;

public class Game extends Favorite {
    private String theme;
    private String platform;

    public Game(String name, int score, int year, String comment, String theme, String platform) {
        super(name, score, year, comment);
        this.theme = theme;
        this.platform = platform;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", score=" + getScore()+
                ", year=" + getYear() +
                ", comment='" + getComment() + '\'' +
                ", platform=" + platform +
                ", theme='" + theme + '\'' +
                '}';
    }
}
