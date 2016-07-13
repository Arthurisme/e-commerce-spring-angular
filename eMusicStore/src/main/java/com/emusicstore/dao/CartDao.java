package com.emusicstore.dao;

import com.emusicstore.model.Cart;


import java.util.List;

/**
 * Created by Arthur on 2016-06-23.
 */
public interface CartDao {

    Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);





}
