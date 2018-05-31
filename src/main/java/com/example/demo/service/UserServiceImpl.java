package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Item;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Harold on 5/20/2018.
 */


@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;


    @Override
    public List<User> getUser() {
        return userDAO.getUser();
    }

    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public boolean login(User user) {
        return userDAO.loginUser(user);
    }
    @Override
    public boolean buyItem(Item item) {
        return userDAO.buyItem(item);
    }

}
