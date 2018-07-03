package com.pitodio.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    @Column(name = "invoice_id")
    private Integer invoice_id;
    @Column(name = "customer_id")
    private Integer customer_id;
    @Column(name = "product_id")
    private Integer product_id;
    @Column(name = "invoice_information_note")
    private String invoice_information_note;
    @Column(name = "invoice_amount")
    private Float invoice_amount;
    @Column(name = "invoice_service_date")
    private String invoice_service_date;

    public Invoice() {}

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getInvoice_information_note() {
        return invoice_information_note;
    }

    public void setInvoice_information_note(String invoice_information_note) {
        this.invoice_information_note = invoice_information_note;
    }

    public Float getInvoice_amount() {
        return invoice_amount;
    }

    public void setInvoice_amount(Float invoice_amount) {
        this.invoice_amount = invoice_amount;
    }

    public String getInvoice_service_date() {
        return invoice_service_date;
    }

    public void setInvoice_service_date(String invoice_service_date) {
        this.invoice_service_date = invoice_service_date;
    }

}
