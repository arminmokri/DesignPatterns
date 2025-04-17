package behavioral.chain_of_responsibility.rbac;

import java.util.ArrayList;
import java.util.List;

public class User {


    private String username;
    private String password;
    private Role role;

    private User(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("admin", "admin", Role.ADMIN));
        users.add(new User("alice", "123", Role.USER));
        users.add(new User("michael", "456", Role.USER));
    }

    public static User getUser(String username) {
        return users.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElseGet(null);
    }

    public boolean isPasswordValid(String password) {
        return this.password.equals(password);
    }
}
