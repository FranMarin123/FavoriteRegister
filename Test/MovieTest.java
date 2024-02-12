package Test;

import Model.Favorite;

public class MovieTest {
    public static void main(String[] args) {
        Favorite movietest1 = new Model.Movie("pepe", 6, 1963, "", 156, "caca");
        System.out.println(movietest1.getClass());
    }
}
