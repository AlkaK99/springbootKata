package com.example.springbootkata.dao;

import com.example.springbootkata.model.User;

import java.util.List;

public interface UserDao {
    List<User> listUser();
    void addUser(User user);
    void deleteUser (Long id);
    void updateUser(Long id, User updatedUser);
    User findUserById (Long id);
}
