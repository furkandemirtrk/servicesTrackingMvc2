package com.pitodio.servicesImpl;

import com.pitodio.dao.BrandDao;
import com.pitodio.entities.Brand;
import com.pitodio.services.BrandServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServicesImpl implements BrandServices {

    @Autowired
    BrandDao brandDao;

    public List<Brand> list() {
        return brandDao.list();
    }
}
