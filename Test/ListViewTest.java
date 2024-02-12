package Test;

import Model.Favorite;
import Model.Game;
import Model.Movie;
import Model.Song;
import View.CreateView;
import View.ListView;

public class ListViewTest {
    static ListView listview = new ListView();
    public static void main(String[] args) {
        listview.showFavs(new Favorite("Avengers", 9, 2012, " "));
        listview.showFavs(new Movie("Xmen", 8, 1999, " ", 159, "action"));
        listview.showFavs(new Song("Bulería", 7, 2003, " ", 3, "Pop"));
        listview.showFavs(new Game("Mario Bros", 9, 1999, " ", "Platfomr", "Nes"));
    }
}
