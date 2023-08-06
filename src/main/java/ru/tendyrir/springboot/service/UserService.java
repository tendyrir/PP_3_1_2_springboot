package ru.tendyrir.springboot.service;

import org.springframework.stereotype.Service;
import ru.tendyrir.springboot.model.User;

import java.util.List;

@Service
public interface UserService {

    List<User> getAll();

    void saveUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
