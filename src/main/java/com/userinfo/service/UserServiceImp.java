package com.userinfo.service;

import com.userinfo.model.User;
import com.userinfo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void createUser(User user) {
        userRepository.createUser(user);
    }

    public void updateUser(User user) {
        userRepository.updateUser(user);
    }

    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    public void deleteUser(Long id) {
            userRepository.deleteUser(id);
    }
}