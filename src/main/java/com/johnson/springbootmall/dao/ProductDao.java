package com.johnson.springbootmall.dao;

import com.johnson.springbootmall.modal.Product;

public interface ProductDao {

    Product getProductById(Integer id);
}
