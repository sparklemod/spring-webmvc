package com.userinfo.service;

import com.userinfo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
}