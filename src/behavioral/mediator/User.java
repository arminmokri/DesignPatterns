package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String username;
    private String password;

    private User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    private final static List<User> users = new ArrayList<>();

    static {
        users.add(new User("alice", "123"));
        users.add(new User("michael", "456"));
    }

    public static User getUser(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElseGet(null);
    }

    public boolean isPasswordValid(String password) {
        return this.password.equals(password);
    }
}
