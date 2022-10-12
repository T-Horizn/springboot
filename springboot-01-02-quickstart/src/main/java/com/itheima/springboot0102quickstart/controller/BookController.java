package com.itheima.springboot0102quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping
    public String book(){
        System.out.println("123springboot is running...");
        return "123springboot is running...";
    }
}
