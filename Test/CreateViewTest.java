package Test;

import Utils.UI;
import View.CreateView;

public class CreateViewTest {
    static CreateView createview = new CreateView();

    public static void main(String[] args) {
        createview.creationInformation();

        UI.pressEnter();

        createview.whatAreYouCreating();

        UI.pressEnter();

        createview.createMovie();

        UI.pressEnter();

        createview.createSong();

        UI.pressEnter();

        createview.createVideogame();

        UI.pressEnter();

        createview.introduceThemeMovie();
        createview.otherThemeMovie();

        UI.pressEnter();

        createview.introduceGenreSong();
        createview.otherGenreSong();

        UI.pressEnter();

        createview.introduceTypeGame();
        createview.otherTypeGame();

        UI.pressEnter();

        createview.introducePlatformGame();
        createview.otherPlatformGame();

        UI.pressEnter();
    }
}
