package com.emusicstore.controller;

import com.emusicstore.model.Cart;
import com.emusicstore.model.Customer;
import com.emusicstore.model.CustomerOrder;
import com.emusicstore.service.CartService;
import com.emusicstore.service.CustomerOrderService;
import com.emusicstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Arthur on 2016-07-16.
 */
@Controller
public class OrderController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CartService cartService;

    @Autowired
    private CustomerOrderService customerOrderService;

    @RequestMapping("/order/{cartId}")
    public String orderPage (@PathVariable(value="cartId") int cartId){

        Cart cart = cartService.getCartById(cartId);

        Customer customer = cart.getCustomer();

        CustomerOrder customerOrder = new CustomerOrder();
        customerOrder.setCart(cartService.getCartById(cartId));
        customerOrder.setCustomer(customer);
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customerOrder.setShippingAddress(customer.getShippingAddress());
        customerOrderService.addCustomerOrder(customerOrder);


        return "redirect:/checkout?cartId="+cartId;
    }
}
