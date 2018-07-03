package com.pitodio.daoImpl;

import com.pitodio.dao.InvoiceDao;
import com.pitodio.entities.Invoice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Repository
@Transactional
public class InvoiceDaoImpl implements InvoiceDao {

    @Autowired
    SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(InvoiceDao.class);

    @SuppressWarnings("unchecked")
    public List<Invoice> list() {
        return sessionFactory.getCurrentSession().createCriteria(Invoice.class).list();

    }

    public boolean delete(Invoice invoice) {
        try {
            sessionFactory.getCurrentSession().delete(invoice);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean saveInvoice(Invoice invoice) {
        sessionFactory.getCurrentSession().save(invoice);
        return true;
    }

    public Invoice getInvoice(int id) {
        Session session = this.sessionFactory.getCurrentSession();

        Invoice invoice = (Invoice) session.get(Invoice.class, new Integer(id));
        return invoice;
    }

    public void removeInvoice(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Invoice p = (Invoice) session.load(Invoice.class, new Integer(id));
        if (null != p) {
            session.delete(p);
        }
        logger.info("Invoice deleted successfully, User details=" + p);

    }

    public boolean updateInvoice(Invoice invoice) {
        sessionFactory.getCurrentSession().update(invoice);
        return true;
    }

}
