package View;

import Interfaces.ICreateView;
import Model.Favorite;

public class CreateView implements ICreateView {

    @Override
    public String introduceName() {
        return null;
    }

    @Override
    public int introduceRating() {
        return 0;
    }

    @Override
    public String introduceComment() {
        return null;
    }

    @Override
    public int introduceYear() {
        return 0;
    }

    @Override
    public int whatAreYouCreating() {
        return 0;
    }

    @Override
    public int introduceMovieDuration() {
        return 0;
    }

    @Override
    public int introduceThemeMovie() {
        return 0;
    }

    @Override
    public String otherThemeMovie() {
        return null;
    }

    @Override
    public int introduceSongDuration() {
        return 0;
    }

    @Override
    public int introduceGenreSong() {
        return 0;
    }

    @Override
    public String otherGenreSong() {
        return null;
    }

    @Override
    public int introduceTypeGame() {
        return 0;
    }

    @Override
    public String otherTypeGame() {
        return null;
    }

    @Override
    public int introducePlatformGame() {
        return 0;
    }

    @Override
    public String otherPlatformGame() {
        return null;
    }
}
