package com.example.testapplicationbe.persistence;

import com.example.testapplicationbe.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getAllUsers() {

        Query query = sessionFactory.getCurrentSession().createQuery("from User");

        if (query.getResultList().size() == 0) {
            return null;
        }
        return query.getResultList();
    }

}
