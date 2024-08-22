package com.huseyinozkan.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        return "HelloWorld";
    }
}
