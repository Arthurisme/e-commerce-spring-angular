package com.emusicstore.service;

import com.emusicstore.model.Customer;
import com.emusicstore.model.CustomerOrder;

import java.util.List;

/**
 * Created by Arthur on 2016-07-14.
 */
public interface CustomerOrderService {

    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal (int cartId);


}
