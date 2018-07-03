package com.pitodio.daoImpl;

import com.pitodio.dao.BrandDao;
import com.pitodio.entities.Brand;
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
public class BrandDaoImpl implements BrandDao {

    @Autowired
    SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(BrandDao.class);

    @SuppressWarnings("unchecked")
    public List<Brand> list() {
        return sessionFactory.getCurrentSession().createCriteria(Brand.class).list();

    }

    public Brand getBrand(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Brand brand = (Brand) session.get(Brand.class, new Integer(id));
        return brand;
    }
}
