package Model;

import java.util.Objects;

public class Favorite {
    private final int MINID = 1;
    private final int MAXID = 9999;
    private int id;
    private String name;
    private int score;
    private int year;
    private String comment;

    public Favorite(String name, int score, int year, String comment) {
        this.setId();
        this.name = name;
        this.score = score;
        this.year = year;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = (int) (Math.random() * (MAXID - MINID)) + MINID;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorite favorite = (Favorite) o;
        return id == favorite.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", year=" + year +
                ", comment='" + comment + '\'' +
                '}';
    }
}
