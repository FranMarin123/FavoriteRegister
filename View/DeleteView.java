package View;

import Interfaces.IDeleteView;

public class DeleteView implements IDeleteView {

    @Override
    public int deleteFavoriteById() {
        return 0;
    }

    @Override
    public boolean sureToDelete() {
        return false;
    }
}
