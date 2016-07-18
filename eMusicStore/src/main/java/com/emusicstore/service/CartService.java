package com.emusicstore.service;

import com.emusicstore.model.Cart;
import com.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by Arthur on 2016-07-14.
 */
public interface CartService {



    Cart getCartById(int cartId);

    void update(Cart cart);


}
