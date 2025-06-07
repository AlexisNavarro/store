package com.alexisfirstspring.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //request mapping "/" points to the root of the website
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }
}
