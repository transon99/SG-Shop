package com.spring_boot.SGShop.service;

import com.spring_boot.SGShop.modal.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUser();
    Optional<User> getUserById(Long id);
    User insertUser(User user);

    String deleteUser(Long id);
    Optional<User> updateUser(Long id, User user);

//    List<User> getUserByLastName(String lastName);
}
