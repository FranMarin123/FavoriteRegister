import Model.*;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        Library testLibrary = new Library(new User("Pintor", "1234"));
        //testLibrary.iniciateAllFavs();
        Favorite fav1 = new Game("Call of duty", 2, 2023, "Una mierda", "Shooter", "PC");
        Favorite fav2 = new Song("Los del espacio", 9, 2023, "R.I.P. Duki", 300, "Urbano");
        Favorite fav3 = new Movie("El lobo de wall street", 10, 2013, "Yo literal", 5000, "Basado en la vida real");
        testLibrary.createFavorite(fav1);
        testLibrary.createFavorite(fav2);
        testLibrary.createFavorite(fav3);
        //File newFile=new File("saveFile\\x");
        //System.out.println(newFile.toString());
        /*System.out.println(fav1.getClass());
        System.out.println(fav2.getClass());
        System.out.println(fav3.getClass());*/
        //representArray(testLibrary.findByYear(2023));
        //representArray(testLibrary.findXFav(3));


    }

    public static void representArray(Favorite[] favs){
        for (int i=0 ; i<favs.length;i++){
            System.out.println(favs[i].toString());
        }
    }
}
