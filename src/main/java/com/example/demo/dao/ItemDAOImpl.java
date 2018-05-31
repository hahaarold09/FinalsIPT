package com.example.demo.dao;

import com.example.demo.entity.Item;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Harold on 5/30/2018.
 */
@Repository
@Transactional
public class ItemDAOImpl implements ItemDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Item> getItems() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from Item");
        List<Item> item= theQuery.list();
        return item;
    }

    @Override
    public void saveItem(Item item) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(item);
    }


}
