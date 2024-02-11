package View;

import Interfaces.IDeleteView;
import Utils.UI;

import java.util.Scanner;

public class DeleteView implements IDeleteView {

    @Override
    public int deleteMenu() {
        System.out.println("1. Delete by ID.");
        System.out.println("2. Go back.");
        return UI.readInt("Select an option: ");
    }

    @Override
    public int deleteFavoriteById() {
        return UI.readInt("Introduce the ID for the favourite you want to delete: ");
    }

    @Override
    public boolean sureToDelete() {
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
