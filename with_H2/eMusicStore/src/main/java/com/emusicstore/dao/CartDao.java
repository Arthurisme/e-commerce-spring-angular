package com.emusicstore.dao;

import com.emusicstore.model.Cart;


import java.io.IOException;
import java.util.List;

/**
 * Created by Arthur on 2016-06-23.
 */
public interface CartDao {


    Cart getCartById(int cartId);

    void update(Cart cart);

    Cart validate(int cartId) throws IOException;






}
