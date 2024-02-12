package View;

import Interfaces.IUpdateView;
import Utils.UI;

import java.util.Scanner;

public class UpdateView implements IUpdateView {
    @Override
    public int updateMenu() {
        System.out.println("1. Update the list.");
        System.out.println("2. Go back.");
        return UI.readInt("Select an option: ");
    }

    @Override
    public String updateFavorite() {
        return UI.readString("Introduce the name for the favourite you want to update: ");
    }
    @Override
    public boolean sureToUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to update the list? (S/N)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("s")) {
            return true;
        } else {
            return false;
        }
    }
}
