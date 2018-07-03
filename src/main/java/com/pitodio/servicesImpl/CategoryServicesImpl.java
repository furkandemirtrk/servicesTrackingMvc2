package com.pitodio.servicesImpl;

import com.pitodio.dao.CategoryDao;
import com.pitodio.entities.Category;
import com.pitodio.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicesImpl implements CategoryServices {

    @Autowired
    CategoryDao categoryDao;

    public List<Category> list() {
        return categoryDao.list();
    }
}
