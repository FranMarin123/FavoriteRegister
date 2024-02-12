package View;

import Interfaces.ICreateView;
import Model.Favorite;
import Model.Game;
import Model.Movie;
import Model.Song;
import Utils.UI;

public class CreateView implements ICreateView {

    @Override
    public void creationInformation() {
        System.out.println("We need some data to create the new favourite like the name, rating, one comment if you want, and the release year. \n" +
                "If is a movie we need the duration of the movie and the theme.\n" +
                "If is a song we need the duration of the song and the genre.\n" +
                "At last, if is a videogame we need the type of the videogame and the platform.");
    }

    @Override
    public int whatAreYouCreating() {
        System.out.println("What do you want to add to favourite?");
        System.out.println("1. Movie");
        System.out.println("2. Song");
        System.out.println("3. Videogame");
        return UI.readInt("Select an option: ");
    }

    //Hay que poner que al llegar al tema de la película salgan las opciones del método introduceThemeMovie(),
    //y que si selecciona la opción 11. Other, le salga para poder escribir el tema

    public Movie createMovie(){
        Movie favCreated=new Movie(UI.readString("Introduce the name: "),
                UI.readInt("Introduce the rating: "),
                UI.readInt("Introduce the year: "),
                UI.readString("Introduce one comment: "),
                UI.readInt("Introduce the duration: "),
                UI.readString("Introduce the theme: \n" +
                        "1. Action\n" +
                        "2. Adventure\n" +
                        "3. Animation\n" +
                        "4. Comedy\n" +
                        "5. Sci-Fi\n" +
                        "6. Drama\n" +
                        "7. Fantasy\n" +
                        "8. Terror\n" +
                        "9. Mystery\n" +
                        "10. Romantic\n" +
                        "11. Other\n" +
                        "Write the option: ")
                );

        return favCreated;
    }


    @Override
    public Song createSong() {
        Song favCreated=new Song(UI.readString("Introduce the name: "),
                UI.readInt("Introduce the rating: "),
                UI.readInt("Introduce the year: "),
                UI.readString("Introduce one comment: "),
                UI.readInt("Introduce the duration: "),
                UI.readString("Introduce the genre: ")
                );
        return favCreated;
    }

    @Override
    public Game createVideogame() {
        Game favCreated=new Game(UI.readString("Introduce the name: "),
                UI.readInt("Introduce the rating: "),
                UI.readInt("Introduce the year: "),
                UI.readString("Introduce one comment: "),
                UI.readString("Introduce the theme: "),
                UI.readString("Introduce the platform: ")
                );
        return favCreated;
    }

    @Override
    public int introduceThemeMovie() {
        System.out.println("What is the theme of the movie?");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Animation");
        System.out.println("4. Comedy");
        System.out.println("5. Sci-Fi");
        System.out.println("6. Drama");
        System.out.println("7. Fantasy");
        System.out.println("8. Terror");
        System.out.println("9. Mystery");
        System.out.println("10. Romantic");
        System.out.println("11. Other");
        return UI.readInt("Select an option: ");
    }

    //En el método otherThemeMovie() no se como hacer para que al escribirlo, esto que escriba se adjudique a la variable theme de movie

    @Override
    public String otherThemeMovie() {
        UI.readString("Introduce the theme: ");
        return null;
    }

    //A partir de este comentario pasa igual que con Movie, siendo para Song y Videogame

    @Override
    public int introduceGenreSong() {
        System.out.println("What is the theme of the song?");
        System.out.println("1. Pop");
        System.out.println("2. Rock");
        System.out.println("3. Hip Hop/Rap");
        System.out.println("4. Electrónica (EDM - Electronic Dance Music)");
        System.out.println("5. R&B (Rhythm and Blues)");
        System.out.println("6. Reggaetón");
        System.out.println("7. Country");
        System.out.println("8. Jazz");
        System.out.println("9. Clásica");
        System.out.println("10. Indie");
        System.out.println("11. Other");
        return UI.readInt("Select an option: ");
    }

    @Override
    public String otherGenreSong() {
        UI.readString("Introduce the genre: ");
        return null;
    }

    @Override
    public int introduceTypeGame() {
        System.out.println("What is the type of the videogame?");
        System.out.println("1. Shooter");
        System.out.println("2. Battle Royale");
        System.out.println("3. Open World");
        System.out.println("4. RPG (Role-Playing Game)");
        System.out.println("5. Sports");
        System.out.println("6. Action-Adventure");
        System.out.println("7. RTS (Real-Time Strategy)");
        System.out.println("8. MOBA (Multiplayer Online Battle Arena)");
        System.out.println("9. Survival");
        System.out.println("10. Platformer");
        System.out.println("11. Other");
        return UI.readInt("Select an option: ");
    }

    @Override
    public String otherTypeGame() {
        UI.readString("Introduce the type: ");
        return null;
    }

    @Override
    public int introducePlatformGame() {
        System.out.println("What is the platform of the videogame?");
        System.out.println("1. PS5");
        System.out.println("2. PS4");
        System.out.println("3. Xbox Series X/S");
        System.out.println("4. Xbox One");
        System.out.println("5. Nintendo Switch");
        System.out.println("6. Nintendo 3DS");
        System.out.println("7. PC");
        System.out.println("8. Mobile");
        System.out.println("9. Other");
        return UI.readInt("Select an option: ");
    }

    @Override
    public String otherPlatformGame() {
        UI.readString("Introduce the platform: ");
        return null;
    }
}
