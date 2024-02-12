package Controller;

import Interfaces.IMainController;
import Model.Favorite;
import Model.Library;
import Model.User;
import Serializator.Serializator;
import Utils.UI;
import View.*;

import java.io.File;

public class MainController implements IMainController {

    Library favsLibrary = new Library();
    MainView mainView = new MainView();
    CreateView createView = new CreateView();
    FindView findView = new FindView();
    ListView listView = new ListView();
    DeleteView deleteView = new DeleteView();
    UpdateView updateView = new UpdateView();
    LoginView loginView = new LoginView();

    @Override
    public void startApp() {
        mainView.welcomeProgram();
        String username = loginView.introduceUsername();
        int option = -1;
        boolean correctLogin = false;
        //Inicio Sesión

        File userFile = new File("saveFile\\" + username);
        if (userFile.exists()) {
            favsLibrary = Serializator.desearize(userFile.toString());
            if (favsLibrary.getUser().comparePassword(loginView.introducePassword())) {
                loginView.loginCorrectly();
                correctLogin=true;
            } else {
                loginView.loginWrong();
            }
        } else {
            favsLibrary.setUser(new User(username,loginView.introducePassword()));
            correctLogin=true;
        }
        if (correctLogin) {
            do {
                option = mainView.whatToDo();
                optionSelector(option);
            } while (option != 6);
            Serializator.serialize(favsLibrary, userFile.toString());
            System.out.println(Serializator.serialize(favsLibrary, userFile.toString()));
        }
    }

    public void optionSelector(int option) {
        int type = -1;
        switch (option) {
            case 1:
                createView.creationInformation();
                do {
                    type = createView.whatAreYouCreating();
                    favsLibrary.createFavorite(addFav(type));
                } while (type < 1 && type > 3);
                UI.pressEnter();
                break;
            case 2:
                do {
                    type = findView.HowYouWantToSearch();
                    showFav(type);
                } while (type < 1 && type > 5);
                UI.pressEnter();
                break;
            case 3:
                type = listView.howManyFavs();
                if (type > 0) {
                    listView.showXFavs(favsLibrary.findXFav(type));
                }
                break;
            case 4:
                type = deleteView.deleteMenu();
                removeFav(type);
                break;
            case 5:
                type = updateView.updateMenu();
                if (type == 1) {
                    String name = updateView.updateFavorite();
                    if (updateView.sureToUpdate()) {
                        if (favsLibrary.findByName(name) != null) {
                            System.out.println(favsLibrary.updateFavorite(name, createView.createFavorite()));
                        } else {
                            System.out.println("No se pudo actualizar");
                        }
                    }
                }
            case 6:
                mainView.goodByeProgram();
                break;
        }
    }

    @Override
    public Favorite addFav(int typeNum) {
        Favorite createdFav = null;
        switch (typeNum) {
            case 1:
                createdFav = (Favorite) createView.createMovie();

                break;
            case 2:
                createdFav = (Favorite) createView.createSong();
                break;
            case 3:
                createdFav = (Favorite) createView.createVideogame();
                break;
        }
        return createdFav;
    }

    public void showFav(int numTypeShow) {
        switch (numTypeShow) {
            case 1:
                listView.showFavs(favsLibrary.findById(findView.findById()));
                break;
            case 2:
                listView.showFavs(favsLibrary.findByName(findView.findByName()));
                break;
            case 3:
                listView.showXFavs(favsLibrary.findByYear(findView.findByYear()));
                break;
            case 4:
                listView.showXFavs(favsLibrary.findByRating(findView.findByRating()));
                break;
            case 5:
                break;

        }
    }

    @Override
    public void removeFav(int type) {
        if (type == 1) {
            int id = deleteView.deleteFavoriteById();
            if (deleteView.sureToDelete()) {
                if (favsLibrary.deleteFavoriteById(id) != null) {
                    System.out.println(favsLibrary.deleteFavoriteById(id));
                } else {
                    System.out.println("No se pudo borrar");
                }
            }
        }
    }

}
