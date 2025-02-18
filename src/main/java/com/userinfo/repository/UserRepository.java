package com.userinfo.repository;

import com.userinfo.model.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(User user);

    User getUser(long id);

    void deleteUser(long id);
}