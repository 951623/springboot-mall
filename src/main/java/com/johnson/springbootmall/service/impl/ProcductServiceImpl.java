package com.johnson.springbootmall.service.impl;

import com.johnson.springbootmall.dao.ProductDao;
import com.johnson.springbootmall.modal.Product;
import com.johnson.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer id) {
        return productDao.getProductById(id);
    }
}
