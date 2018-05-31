package com.example.demo.service;

import com.example.demo.dao.ItemDAO;
import com.example.demo.dao.UserDAO;
import com.example.demo.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

/**
 * Created by Harold on 5/30/2018.
 */
@Service
@Transactional
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemDAO itemDAO;



    @Override
    public List<Item> getItems() {
       return itemDAO.getItems();
    }

    @Override
    public void saveItems(Item item) {
        itemDAO.saveItem(item);
    }





}
