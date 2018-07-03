package com.pitodio.servicesImpl;

import com.pitodio.dao.ModelDao;
import com.pitodio.entities.Model;
import com.pitodio.services.ModelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelServicesImpl implements ModelServices {

    @Autowired
    ModelDao modelDao;

    public List<Model> list() {
        return modelDao.list();
    }
}
