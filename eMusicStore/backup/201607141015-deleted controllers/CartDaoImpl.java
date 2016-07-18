package com.emusicstore.dao.impl;

import com.emusicstore.dao.CartDao;
import com.emusicstore.model.Cart;
import com.emusicstore.model.CartItem;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Arthur on 2016-06-23.
 */

@Repository
public class CartDaoImpl implements CartDao {

    private Map<String, Cart> listOfCarts;

    public CartDaoImpl(){
        listOfCarts = new HashMap<String, Cart>();

    }

    public Cart create(Cart cart) {
        if (listOfCarts.keySet().contains(cart.getCartId())) {
            throw new IllegalArgumentException(String.format("Can not create a cart. A cart with the given id(%) " +
                    "already " + "exists", cart.getCartId()));
        }

        listOfCarts.put(cart.getCartId(), cart);



        return cart;
    }

    public Cart read(String cartId) {
        Cart cart = listOfCarts.get(cartId);

//        System.out.println("listOfCarts"+listOfCarts);
        Set<String> keys = listOfCarts.keySet();  //get all keys
        for(String i: keys)
        {
            System.out.println(i);

            System.out.println(listOfCarts.get(i));
        }

        return cart;
    }

    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId)) {

            throw new IllegalArgumentException(String.format("Can not update a cart. A cart with the given id(%) " +
                    "does not " + "exists", cart.getCartId()));
        }
        listOfCarts.put(cartId, cart);
    }

    public void delete(String cartId ) {
        if (!listOfCarts.keySet().contains(cartId)) {

            throw new IllegalArgumentException(String.format("Can not update a cart. A cart with the given id(%) " +
                    "does not " + "exists",cartId));
        }
        listOfCarts.remove(cartId );
    }

}
