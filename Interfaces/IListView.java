package Interfaces;

import Model.Favorite;

public interface IListView {
    int howManyFavs();

    void showXFavs(Favorite[] favsToShow);

    void showFavs(Favorite favorite);
}
