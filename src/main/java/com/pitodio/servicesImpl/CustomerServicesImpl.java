package com.pitodio.servicesImpl;

import com.pitodio.dao.CustomerDao;
import com.pitodio.entities.Customer;
import com.pitodio.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    CustomerDao customerDao;

    public List<Customer> list() {
        return customerDao.list();
    }
}
