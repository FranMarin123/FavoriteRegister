package Interfaces;

import Model.Favorite;

public interface IMainController {
    void startApp();

    Favorite addFav(int typeNum);

    void removeFav(int type);

}
