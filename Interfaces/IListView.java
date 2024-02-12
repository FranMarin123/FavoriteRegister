package Interfaces;

import Model.Favorite;

public interface IListView {
    int howManyFavs();
    void showXFavs();
    void showFavs(Favorite favorite);
}
