package View;

import Interfaces.IMainView;
import Utils.UI;

public class MainView implements IMainView {
    @Override
    public void welcomeProgram() {
        System.out.println("Welcome to LetterFavs.");
    }

    public int whatToDo() {
        System.out.println("1. Create a new favourite thing.");
        System.out.println("2. Search favourites.");
        System.out.println("3. Show the favourite list.");
        System.out.println("4. Delete favourites.");
        System.out.println("5. Update the favourite list.");
        System.out.println("6. Close the program.");
        return UI.readInt("What do you want to do?");
    }

    @Override
    public void goodByeProgram() {
        System.out.println("Thank you for using LetterFavs.");
    }

    @Override
    public void wantToUpdateFavorite() {
        System.out.println("Are you sure you want to update de list");
    }
}
