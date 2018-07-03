package com.pitodio.daoImpl;


import com.pitodio.dao.CategoryDao;
import com.pitodio.entities.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(CategoryDao.class);

    @SuppressWarnings("unchecked")
    public List<Category> list() {
        return sessionFactory.getCurrentSession().createCriteria(Category.class).list();

    }

    public Category getCategory(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Category category = (Category) session.get(Category.class, new Integer(id));
        return category;
    }
}
