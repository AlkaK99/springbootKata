package com.example.springbootkata.service;

import com.example.springbootkata.dao.UserDaoImpl;
import com.example.springbootkata.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService {

    private UserDaoImpl userDao;
    @Autowired
    public UserServiceImpl(UserDaoImpl userDao){
        this.userDao=userDao;
    }

    @Transactional
    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }

    @Transactional
    @Override
    public void addUser(User user) {
        userDao.addUser(user);

    }

    @Transactional
    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);

    }

    @Transactional
    @Override
    public void updateUser(Long id, User updatedUser) {
        userDao.updateUser(id,updatedUser);

    }

    @Transactional
    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }
}