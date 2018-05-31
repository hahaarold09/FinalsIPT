package com.example.demo.dao;

import com.example.demo.entity.Item;

import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */
public interface ItemDAO {


    List<Item> getItems();
    void saveItem(Item item);



}
