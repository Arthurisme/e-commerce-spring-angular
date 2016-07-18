package com.emusicstore.service;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;

import java.util.List;

/**
 * Created by Arthur on 2016-07-14.
 */
public interface ProductService {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product product);

    void editProduct(Product product);

    void deleteProduct(Product product);

}
