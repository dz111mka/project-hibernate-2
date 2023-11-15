package org.example.dao;

import org.example.org.example.entity.Address;
import org.example.org.example.entity.Category;
import org.hibernate.SessionFactory;



public class CategoryDAO extends GenericDAO<Category>{
    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
