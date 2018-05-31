package com.example.demo.service;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by Harold on 5/20/2018.
 */
public interface UserService {

    List<User> getUser();
    void saveUser(User user);
    boolean login(User user);
    boolean buyItem(Item item);

}
