package com.pitodio.daoImpl;

import com.pitodio.dao.CustomerDao;
import com.pitodio.entities.Customer;
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
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(CustomerDao.class);

    @SuppressWarnings("unchecked")
    public List<Customer> list() {
        return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();

    }

    public Customer getCustomer(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Customer customer = (Customer) session.get(Customer.class, new Integer(id));
        return customer;
    }

}
