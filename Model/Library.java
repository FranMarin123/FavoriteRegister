package Model;

import Interfaces.ILibrary;

import java.util.Objects;

public class Library implements ILibrary {
    User user;
    Favorite[] favorites;


    @Override
    public Favorite createFavorite(Favorite favToAdd) {
        Favorite favToReturn = null;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i] == null) {
                favorites[i] = favToAdd;
                favToReturn = favToAdd;
            }
        }
        return favToReturn;
    }

    @Override
    public Favorite[] findXFav(int numFav) {
        Favorite[] XFavs = new Favorite[numFav];
        int randomPos = -1;
        boolean comp = false;
        if (numFav < favorites.length) {
            for (int i = 0; i < XFavs.length; i++) {
                while (!comp) {
                    randomPos = (int) (Math.random() * (numFav));
                    if (isFavRepite(XFavs, favorites[randomPos])) {
                        XFavs[i] = favorites[randomPos];
                        comp = true;
                    }
                }
                comp = false;
            }
        }
        return XFavs;
    }

    public boolean isFavRepite(Favorite[] favs, Favorite favToComp) {
        boolean comp = false;
        for (int i = 0; i < favs.length && !comp; i++) {
            if (favs[i] != null && favs[i].equals(favToComp)) {
                comp = true;
            }
        }
        return comp;
    }

    @Override
    public Favorite findById(int id) {
        boolean finishProgram = false;
        Favorite favSelected = null;
        for (int i = 0; i < favorites.length && !finishProgram; i++) {
            if (favorites[i].getId() == id) {
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
            if (Objects.equals(favorites[i].getName(), name)) {
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
            if (favorites[i].getYear() == year) {
                favs[j] = favorites[i];
                j++;
            }
        }
        return favs;
    }

    public int favsWithSameYear(int year) {
        int cont = 0;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i].getYear() == year) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public Favorite[] findByRating(int rating) {
        Favorite[] favs = new Favorite[favsWithSameRating(rating)];
        for (int i = 0, j = 0; i < favorites.length; i++) {
            if (favorites[i].getScore() == rating) {
                favs[j] = favorites[i];
                j++;
            }
        }
        return favs;
    }

    public int favsWithSameRating(int rating) {
        int cont = 0;
        for (int i = 0; i < favorites.length; i++) {
            if (favorites[i].getScore() == rating) {
                cont++;
            }
        }
        return cont;
    }

    @Override
    public Favorite deleteFavorite(String name) {
        Favorite favToDelete=null;
        boolean finishProgram=false;
        for(int i=0;i<favorites.length && !finishProgram;i++){
            if (Objects.equals(favorites[i].getName(), name)){
                favToDelete=favorites[i];
                favorites[i]=null;
                finishProgram=true;
            }
        }
        return favToDelete;
    }

    @Override
    public Favorite deleteFavoriteById(int id) {
        Favorite favToDelete=null;
        boolean finishProgram=false;
        for(int i=0;i<favorites.length && !finishProgram;i++){
            if (favorites[i].getId()==id){
                favToDelete=favorites[i];
                favorites[i]=null;
                finishProgram=true;
            }
        }
        return favToDelete;
    }

    @Override
    public Favorite updateFavorite(String name, Favorite favToUpd) {
        Favorite favBefUpd=null;
        boolean finishProgram=false;
        for(int i=0;i<favorites.length && !finishProgram;i++){
            if (Objects.equals(favorites[i].getName(), name)){
                favBefUpd=favorites[i];
                favorites[i]=favToUpd;
                finishProgram=true;
            }
        }
        return favBefUpd;
    }
}
