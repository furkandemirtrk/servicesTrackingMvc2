package com.pitodio.daoImpl;

import com.pitodio.dao.BrandDao;
import com.pitodio.dao.ModelDao;
import com.pitodio.entities.Brand;
import com.pitodio.entities.Model;
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
public class ModelDaoImpl implements ModelDao {
    @Autowired
    SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(ModelDao.class);

    @SuppressWarnings("unchecked")
    public List<Model> list() {
        return sessionFactory.getCurrentSession().createCriteria(Model.class).list();

    }

    public Model getModel(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Model model = (Model) session.get(Model.class, new Integer(id));
        return model;
    }
}
