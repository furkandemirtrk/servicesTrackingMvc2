package com.pitodio.servicesImpl;

import com.pitodio.dao.InvoiceDao;
import com.pitodio.entities.Invoice;
import com.pitodio.services.InvoiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServicesImpl implements InvoiceServices {

    @Autowired
    InvoiceDao invoiceDao;


    public List<Invoice> list() {
        return invoiceDao.list();
    }

    public boolean delete(Invoice invoice) {
        return invoiceDao.delete(invoice);
    }

    public boolean saveInvoice(Invoice invoice) {
        return invoiceDao.saveInvoice(invoice);
    }

    public boolean updateInvoice(Invoice invoice) {
        return invoiceDao.updateInvoice(invoice);
    }

    public Invoice getInvoice(int id) {
        return invoiceDao.getInvoice(id);
    }

    public void removeInvoice(int id) {
        invoiceDao.removeInvoice(id);
    }
}
