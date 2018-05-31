package com.example.demo.service;

import com.example.demo.entity.Item;

import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */
public interface ItemService {

    List<Item> getItems();
    void saveItems(Item item);


}
