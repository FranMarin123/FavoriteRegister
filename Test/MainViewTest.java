package Test;

import Utils.UI;
import View.MainView;

public class MainViewTest {
    static MainView mainview = new MainView();
    public static void main(String[] args) {
        mainview.welcomeProgram();
        mainview.whatToDo();
        mainview.goodByeProgram();

        UI.pressEnter();
    }
}
