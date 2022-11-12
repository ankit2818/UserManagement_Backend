package com.project.usermgmnt.service;

import com.project.usermgmnt.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUserById(Long id);

    User updateUser(Long id, User user);
}
