package DAO;

import model.User;

public interface UserDAO {
    User authenticate(String username, String password);
    boolean addAdmin(User user);
}