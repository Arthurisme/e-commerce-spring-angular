package com.emusicstore.dao.impl;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Arthur on 2016-06-12.
 */

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;


    public  void addProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public  void editProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

    public  Product getProductById (String id){
        Session session = sessionFactory.getCurrentSession();
        Product product = (Product) session.get(Product.class,id);
        session.flush();

        return  product;
    }

    public  void addProduct (Product product){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
    }

}
