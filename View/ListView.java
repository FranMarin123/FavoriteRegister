package View;

import Interfaces.IListView;
import Utils.UI;

public class ListView implements IListView {

    @Override
    public int howManyFavs() {
        System.out.println("How many favs do you want to list?");
        System.out.println("1. 5.");
        System.out.println("2. 10.");
        System.out.println("3. 15.");
        System.out.println("4. 20.");
        System.out.println("5. 25.");
        System.out.println("6. Go back.");
        return UI.readInt("Select an option: ");
    }

    @Override
    public void showXFavs() {

    }
}
