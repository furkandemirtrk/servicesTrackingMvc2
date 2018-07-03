package com.pitodio.dao;

import com.pitodio.entities.Invoice;

import java.util.List;

public interface InvoiceDao {
    public List<Invoice> list();

    public boolean delete(Invoice users);

    public boolean saveInvoice(Invoice invoice);

    public boolean updateInvoice(Invoice invoice);

    public Invoice getInvoice(int id);

    public void removeInvoice(int id);
}
