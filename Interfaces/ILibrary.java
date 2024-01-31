package Interfaces;

import Model.Favorite;

public interface ILibrary {
    Favorite createFavorite(Favorite favToAdd);
    Favorite[] findXFav(int numFav);
    Favorite findById(int id);
    Favorite findByName(String name);
}
