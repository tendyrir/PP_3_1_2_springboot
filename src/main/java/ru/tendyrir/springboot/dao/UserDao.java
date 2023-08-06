package ru.tendyrir.springboot.dao;

import ru.tendyrir.springboot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAll();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);

}
