package View;

import Interfaces.ILoginView;
import Utils.UI;

public class LoginView implements ILoginView {
    @Override
    public String introduceUsername() {
        return UI.readString("Introduce the username: ");
    }

    @Override
    public String introducePassword() {
        return UI.readString("Introduce the password: ");
    }

    @Override
    public void loginCorrectly() {
        System.out.println("It`s correct.");
    }

    @Override
    public void loginError() {
        System.out.println("The username or the password are wrong");
    }
}
