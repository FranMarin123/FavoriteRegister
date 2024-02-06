package Interfaces;

import Model.Favorite;

public interface ILibrary {
    Favorite createFavorite(Favorite favToAdd);
    Favorite[] findXFav(int numFav);
    Favorite findById(int id);
    Favorite findByName(String name);
    Favorite[] findByYear(int year);
    Favorite[] findByRating(int rating);
    Favorite deleteFavorite(String name);
    Favorite deleteFavoriteById(int id);
    Favorite updateFavorite(String name);
}
