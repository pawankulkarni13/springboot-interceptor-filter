package com.stark.springbootinterceptorfilter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @GetMapping("/app")
    public void print(){
        System.out.println("Hellow World !!!");
    }
}
