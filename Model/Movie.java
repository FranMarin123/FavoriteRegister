package Model;

public class Movie extends Favorite{
    private int duration;
    private String theme;

    public Movie(String name, int score, int year, String comment, int duration, String theme) {
        super(name, score, year, comment);
        this.duration = duration;
        this.theme = theme;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", score=" + getScore()+
                ", year=" + getYear() +
                ", comment='" + getComment() + '\'' +
                ", duration=" + duration +
                ", theme='" + theme + '\'' +
                '}';
    }
}
