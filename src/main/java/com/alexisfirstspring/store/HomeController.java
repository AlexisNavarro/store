package com.alexisfirstspring.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    //request mapping "/" points to the root of the website
    @RequestMapping("/")
    public String index(){
        System.out.println("appName: " + appName);
        return "index.html";
    }

}
