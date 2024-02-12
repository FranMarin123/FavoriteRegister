package Model;

import Interfaces.ILibrary;

import java.util.Arrays;
import java.util.Objects;

public class Library implements ILibrary {
    User user;
    Favorite[] favorites;

    public Library(User user, Favorite[] favorites) {
        this.user = user;
        this.favorites = favorites;
    }

    public Library(User user) {
        this.user = user;
        this.favorites = new Favorite[50];
    }

    public Library() {
        this.user = null;
        this.favorites = new Favorite[50];
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Favorite[] getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorite[] favorites) {
        this.favorites = favorites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(user, library.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user);
    }

    @Override
    public String toString() {
        return "Library{" +
                "user=" + user +
                ", favorites=" + Arrays.toString(favorites) +
                '}';
    }

    @Override
    public Favorite createFavorite(Favorite favToAdd) {
        Favorite favToReturn = null;
        boolean createComp=false;
        for (int i = 0; i < favorites.length && !createComp; i++) {
            if (favorites[i] == null) {
                favorites[i] = favToAdd;
                favToReturn = favToAdd;
                createComp=true;
            }
        }
        return favToReturn;
    }

    @Override
    public Favorite[] findXFav(int numFav) {
        Favorite[] XFavs = new Favorite[numFav];
        if (numFav < favorites.length) {
            for (int i = 0; i < XFavs.length; i++) {
                XFavs[i]=favorites[i];
            }
        }
        return XFavs;
    }

    @Override
    public Favorite findById(int id) {
        boolean finishProgram = false;
        Favorite favSelected = null;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i]!=null && favorites[i].getId() == id) {
                favSelected = favorites[i];
                finishProgram = true;
            }
        }
        return favSelected;
    }

    @Override
    public Favorite findByName(String name) {
        boolean finishProgram = false;
        Favorite favSelected = null;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i]!=null && Objects.equals(favorites[i].getName(), name)) {
                favSelected = favorites[i];
                finishProgram = true;
            }
        }
        return favSelected;
    }

    @Override
    public Favorite[] findByYear(int year) {
        Favorite[] favs = new Favorite[favsWithSameYear(year)];
        for (int i = 0, j = 0; i < favorites.length; i++) {
            if (favorites[i]!=null && favorites[i].getYear() == year) {
                favs[j] = favorites[i];
                j++;
            }
        }
        return favs;
    }

    public int favsWithSameYear(int year) {
        int cont = 0;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i]!=null && favorites[i].getYear() == year) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public Favorite[] findByRating(int rating) {
        Favorite[] favs = new Favorite[favsWithSameRating(rating)];
        for (int i = 0, j = 0; i < favorites.length; i++) {
            if (favorites[i]!=null && favorites[i].getScore() == rating) {
                favs[j] = favorites[i];
                j++;
            }
        }
        return favs;
    }

    public int favsWithSameRating(int rating) {
        int cont = 0;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i]!=null && favorites[i].getScore() == rating) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public Favorite deleteFavorite(String name) {
        Favorite favToDelete = null;
        boolean finishProgram = false;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i]!=null && Objects.equals(favorites[i].getName(), name)) {
                favToDelete = favorites[i];
                favorites[i] = null;
                finishProgram = true;
            }
        }
        return favToDelete;
    }

    @Override
    public Favorite deleteFavoriteById(int id) {
        Favorite favToDelete = null;
        boolean finishProgram = false;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i]!=null && favorites[i].getId() == id) {
                favToDelete = favorites[i];
                favorites[i] = null;
                finishProgram = true;
            }
        }
        return favToDelete;
    }

    @Override
    public Favorite updateFavorite(String name, Favorite favToUpd) {
        Favorite favBefUpd = null;
        boolean finishProgram = false;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i]!=null && Objects.equals(favorites[i].getName(), name)) {
                favBefUpd = favorites[i];
                favorites[i] = favToUpd;
                finishProgram = true;
            }
        }
        return favBefUpd;
    }

    /*public void iniciateAllFavs(){
        for (int i=0;i<favorites.length;i++){
            favorites[i]=new Favorite();
        }
    }*/
}
