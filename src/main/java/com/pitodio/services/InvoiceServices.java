package com.pitodio.services;

import com.pitodio.entities.Invoice;

import java.util.List;

public interface InvoiceServices {
    public List<Invoice> list();

    public boolean delete(Invoice invoice);

    public boolean saveInvoice(Invoice invoice);

    public boolean updateInvoice(Invoice invoice);

    public Invoice getInvoice(int id);

    public void removeInvoice(int id);
}
