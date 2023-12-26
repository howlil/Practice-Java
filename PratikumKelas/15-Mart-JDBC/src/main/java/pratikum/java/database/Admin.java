package pratikum.java.database;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean check(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}
