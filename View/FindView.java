package View;

import Interfaces.IFindView;
import Utils.UI;

public class FindView implements IFindView {

    @Override
    public int HowYouWantToSearch() {
        System.out.println("How do you want to search?");
        System.out.println("1. By ID.");
        System.out.println("2. By name.");
        System.out.println("3. By year.");
        System.out.println("4. By rating.");
        System.out.println("5. Go back.");
        return UI.readInt("Select an option: ");
    }

    @Override
    public int findById() {
        return UI.readInt("Introduce the ID: ");
    }

    @Override
    public void showById() {

    }

    @Override
    public String findByName() {
        return UI.readString("Introduce the name: ");
    }

    @Override
    public void showByName() {

    }

    @Override
    public int findByYear() {
        return UI.readInt("Introduce the year: ");
    }

    @Override
    public void showByYear() {

    }

    @Override
    public int findByRating() {
        return UI.readInt("Introduce the rating: ");
    }

    @Override
    public void showByRating() {

    }
}
