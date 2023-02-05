package ru.kozheurov.Task31._Boot.dao;



import ru.kozheurov.Task31._Boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUserById(int id);

    void addUser(User user);

    void updateUser(int id, User user);

    void deleteUserById(int id);

}
