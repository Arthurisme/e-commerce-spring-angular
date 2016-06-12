package com.emusicstore.controller;

import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by Arthur on 2016-06-09.
 */

@Controller
public class HomeController {

    private ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){

        List<Product> products = productDao.getProductList();
//        Product product = productList.get(0);
        model.addAttribute("products",products);

        return "productList";
    }

    @RequestMapping("/productList/viewProduct/{productId}")
    public String  viewProduct(@PathVariable String productId, Model model ) throws IOException{

        Product product = productDao.getProductById(productId);
        model.addAttribute("product",product);


        return "viewProduct";
    }

}
