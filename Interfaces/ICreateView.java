package Interfaces;

import Model.Favorite;
import Model.Game;
import Model.Movie;
import Model.Song;

public interface ICreateView {
    void creationInformation();
    int whatAreYouCreating();
    Movie createMovie();
    Song createSong();
    Game createVideogame();
    int introduceThemeMovie();
    String otherThemeMovie();
    int introduceGenreSong();
    String otherGenreSong();
    int introduceTypeGame();
    String otherTypeGame();
    int introducePlatformGame();
    String otherPlatformGame();
}
