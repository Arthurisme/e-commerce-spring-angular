package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Arthur on 2016-06-06.
 */

@Controller
public class HomeController {


@RequestMapping("/")
    public String home(){
        return "home";
    }



}


