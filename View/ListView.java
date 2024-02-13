package View;

import Interfaces.IListView;
import Model.Favorite;
import Model.Game;
import Model.Movie;
import Model.Song;
import Utils.UI;

public class ListView implements IListView {

    @Override
    public int howManyFavs() {
        System.out.println("How many favs do you want to list?");
        System.out.println("If you want to go back, please press 0");
        return UI.readInt("Write the ammount: ");
    }

    @Override
    public void showXFavs(Favorite[] favsToShow) {
        for (int i=0;i<favsToShow.length;i++){
            showFavs(favsToShow[i]);
        }
    }

    @Override
    public void showFavs(Favorite favorite) {
        if (favorite!=null) {
            switch (favorite.getClass().getSimpleName()) {
                case "Movie":
                    Movie movieToShow = (Movie) favorite;
                    System.out.println(movieToShow.toString());
                    break;
                case "Song":
                    Song songToShow = (Song) favorite;
                    System.out.println(songToShow.toString());
                    break;
                case "Game":
                    Game gameToShow = (Game) favorite;
                    System.out.println(gameToShow.toString());
                    break;
                default:
                    // Manejo para otros tipos de objetos
                    System.out.println("Type of object not soported: " + favorite.getClass().getSimpleName());
                    break;
            }
        }else {
            System.out.println("There is no favourite with this name");
        }
    }
}
