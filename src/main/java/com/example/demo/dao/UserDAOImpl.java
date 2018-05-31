package com.example.demo.dao;

import com.example.demo.entity.Item;
import com.example.demo.entity.User;
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
public class UserDAOImpl implements UserDAO {



    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> getUser() {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("from User");
        List<User> user= theQuery.list();
        return user;
    }

    @Override
    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public boolean loginUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        Query theQuery = session.createQuery("select user.username, user.password from User user " +
                "where user.username =:username AND user.password =:password");
        theQuery.setString("username",user.getUsername());
        theQuery.setString("password",user.getPassword());
        if(theQuery.list().size() == 0){
            return false;
        }
        return true;
    }

    @Override
    public boolean buyItem(Item item) {
        Session session1 = sessionFactory.getCurrentSession();
        Query theQuery1 = session1.createQuery("select item.id from Item item where item.id =:id");
        theQuery1.setInteger("id",item.getId());
        if(theQuery1.list().size() == 0){
            return false;
        }
        return true;
    }



}
