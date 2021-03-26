package com.spring.boot.nuxt.js;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {
    @GetMapping(value = "/hello")
    public void helloWorld() {
        System.out.println("Hello World!");
    }
}
