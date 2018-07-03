package com.pitodio.controllers;


import com.pitodio.entities.*;
import com.pitodio.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping(value = "invoice")
public class InvoiceController {

    @Autowired
    InvoiceServices invoiceServices;

    @Autowired
    CustomerServices customerServices;

    @Autowired
    CategoryServices categoryServices;

    @Autowired
    BrandServices brandServices;

    @Autowired
    ModelServices modelServices;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getAll(Invoice invoice) {
        ModelAndView view = new ModelAndView("homePage");
        List<Invoice> data = invoiceServices.list();
        view.addObject("datas", data);
        return view;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    private ModelAndView getInvoiceAdd() {
        ModelAndView view = new ModelAndView("addInvoice");
        view.addObject("invoice", new Invoice());

        List<Category> category = categoryServices.list();
        view.addObject("category" , category);

        for (Category currentCategory: category
                ) {
            view.addObject(currentCategory.getCategory_name());
        }

        List<Customer> customers = customerServices.list();
        view.addObject("customers" , customers);

        for (Customer must: customers
                ) {
            view.addObject(must.getCustomer_name());
        }

        List<Brand> brands = brandServices.list();
        view.addObject("brands" , brands);

        for (Brand CurrentBrand: brands
                ) {
            view.addObject(CurrentBrand.getBrand_name());
        }

        List<Model> models = modelServices.list();
        view.addObject("models" , models);

        for (Model CurrentModel: models
                ) {

            view.addObject(CurrentModel.getModel_name());
        }

        return view;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String addInvoice(@ModelAttribute("invoice") Invoice invoice) {
        invoiceServices.saveInvoice(invoice);
        return "redirect:/invoice/list";
    }


}
