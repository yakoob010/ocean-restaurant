package service;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private List<User> users = new ArrayList<>();

    public AuthService() {
        // Default Admin for Ocean View Resort
        users.add(new User("admin", "ocean123", "ADMIN"));
    }

    public User authenticate(String username, String password) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);
    }

    public void addAdmin(User user) {
        users.add(user);
    }
}
