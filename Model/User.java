package Model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public User() {
        this.username = "";
        this.password="";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {

            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashedBytes = digest.digest(password.getBytes());

            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            String hashedPassword = stringBuilder.toString();

            this.password = hashedPassword;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public boolean comparePassword(String inputPassword) {
        boolean comp;
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashedBytes = digest.digest(inputPassword.getBytes());

            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : hashedBytes) {
                stringBuilder.append(String.format("%02x", b));
            }
            String hashedInputPassword = stringBuilder.toString();

            comp = hashedInputPassword.equals(password);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            comp = false;
        }
        return comp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        String hiddenPassword = password.replaceAll(".", "*");
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + hiddenPassword + '\'' +
                '}';
    }
}
