package com.example.demo.dao;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */
public interface UserDAO {

    List<User> getUser();
    void saveUser(User user);
    boolean loginUser(User user);
    boolean buyItem(Item item);
}
